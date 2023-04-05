package dao;
import java.util.*;
import java.sql.*;
import model.Seance_sea;
public class Seance_seaDAO extends ConnectionDAO {
public Seance_seaDAO() {
super();
}
public int ajouterUnSeance(Seance_sea unSeance) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO seance_sea(id_sea, salleDeClasse_sea, type_sea, nom_sea, date_sea, heure_debut_sea, duree_sea, lien_sea) VALUES (?, ?,?, ?, ?, ?, ?, ?)");
ps.setInt(1, unSeance.getId_sea());
ps.setString(2, unSeance.getSalleDeClasse_sea());
ps.setString(3, unSeance.getType_sea());
ps.setString(4, unSeance.getNom_sea());
ps.setDate(5, unSeance.getDate_sea());
ps.setHeure(6, unSeance.getHeure_debut_sea());
ps.setDouble(7, unSeance.getDuree_sea());
ps.setString(8, unSeance.getLien_sea());
//Execute the raquette
returnValue = ps.executeUpdate();
} catch(Exception e) {
if (e.getMessage().contains("ORA-00001"))
 System.out.println("Cet identifiant de fournisseur existe déjà. Ajout impossible !");
 else
 e.printStackTrace();
 } finally {
 // close the preparedStatement and the connection
 try {
 if (ps != null) {
 ps.close();
 }
 } catch (Exception ignore) {
 }
 try {
 if (con != null) {
 con.close();
 }
 } catch (Exception ignore) {
 }
 }
 return returnValue;
}
public int modifierUnSeance(Seance_sea unSeance) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unSeance set salleDeClasse_sea = ?, type_sea = ?, nom_sea = ?, date_sea = ?, heure_debut_sea = ?, duree_sea = ?, lien_sea = ? WHERE id_sea = ?");
ps.setString(1, unSeance.getSalleDeClasse_sea());
ps.setString(2, unSeance.getType_sea());
ps.setString(3, unSeance.getNom_sea());
ps.setDate(4,unSeance.getDate_sea());
ps.setHeure(5, unSeance.getHeure_debut_sea());
ps.setDouble(6, unSeance.getDuree_sea());
ps.setString(7, unSeance.getLien_sea());
ps.setInt(8, unSeance.getId_sea());
// Execution of the raquette
returnValue = ps.executeUpdate();
}
catch (Exception e) {
e.printStackTrace();
} finally {
// close the preparedStatement and the connection
try {
if (ps != null) {
ps.close();
}
} catch (Exception ignore) {
}
try {
if (con != null) {
con.close();
}
} catch (Exception ignore) {
}
}
return returnValue;
 }
public int supprimerUnSeance(Seance_sea unSeance) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM seance_sea WHERE id_sea = ?");
ps.setInt(1, unSeance.getId_sea());
// Execution of the raquette
returnValue = ps.executeUpdate();
} 
catch (Exception e) {
 e.printStackTrace();
}finally {
// close the preparedStatement and the connection
try {
if (ps != null) {
ps.close();
}
} catch (Exception ignore) {
}
try {
if (con != null) {
con.close();
}
} catch (Exception ignore) {
}
}
return returnValue;
} 
public Seance_sea get(int id_sea) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 Seance_sea returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM seance_sea WHERE id_sea = ?");
 ps.setInt(1, id_sea); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new Seance_sea(rs.getInt("id_sea"),
rs.getString("salleDeClasse_sea"),
rs.getString("type_sea"),
rs.getString("nom_sea"),
rs.getDate("date_sea"),
rs.getHeure("heure_debut_sea"),
rs.getDouble("duree_sea"),
rs.getString("lien_sea"));
 }
 } catch (Exception ee) {
 ee.printStackTrace();
 } finally {
 // close the preparedStatement and the connection
 try {
 if (rs != null) {
 rs.close();
 }
 } catch (Exception ignore) {
 }
 try {
 if (ps != null) {
 ps.close();
 }
 } catch (Exception ignore) {
 }
 try {
 if (con != null) {
 con.close();
 }
 } catch (Exception ignore) {
 }
 }
 return returnValue;
 } 
public ArrayList<Seance_sea> getList() { 
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<Seance_sea> returnValue = new ArrayList<Seance_sea>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM seance_sea");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new Seance_sea(rs.getInt("id_sea"),
rs.getString("salleDeClasse_sea"),
rs.getString("type_sea"),
rs.getString("nom_sea"),
rs.getDate("date_sea"),
rs.getHeure("heure_debut_sea"),
rs.getDouble("duree_sea"),
rs.getString("lien_sea")));
 }
 } catch (Exception ee) {
 ee.printStackTrace();
 } finally {
// close the preparedStatement and the connection
 try {
 if (rs != null)
 rs.close();
 } catch (Exception ignore) {
 }
 try {
 if (ps != null)
 ps.close();
 } catch (Exception ignore) {
 }
 try {
 if (con != null)
 con.close();
 } catch (Exception ignore) {
 }
 }
 return returnValue;
 }
}