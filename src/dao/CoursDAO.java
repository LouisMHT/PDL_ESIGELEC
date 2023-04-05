package dao;
import java.util.*;
import java.sql.*;
import model.Cours;
public class CoursDAO extends ConnectionDAO {
public CoursDAO() {
super();
}
// add to the database
public int ajouterUnCours(Cours unCours) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//connect to the database
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("INSERT INTO Cours (id_cours, masseHoraire_cours, nom_cours, nbTd_cours, nbExam_cours, nbAmphi_cours, nbTp_cours) VALUES (?, ?,?,?. ?, ?, ?)");
ps.setInt(1, unCours.getId_cours());
ps.setDouble(2, unCours.getmasseHoraire_cours());
ps.setString(3, unCours.getnom_cours());
ps.setDouble(4, unCours.getnbTd_cours());
ps.setDouble(5, unCours.getnbExam_cours());
ps.setDouble(6, unCours.getnbAmphi_cours());
ps.setDouble(7, unCours.getnbTp_cours());
// Execution of the raquette
returnValue = ps.executeUpdate();
}
catch (Exception e) {
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
// update the database
public int modifierUnCours(Cours unCours) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unCours set id_cours = ?, masseHoraire_cours = ?, nom_cours = ?, nbTd_cours = ?, nbExam_cours = ?, nbAmphi_cours = ?, nbTp_cours = ? WHERE id_cours = ?");
ps.setInt(1, unCours.getId_cours());
ps.setDouble(2, unCours.getmasseHoraire_cours());
ps.setString(3, unCours.getnom_cours());
ps.setDouble(4, unCours.getnbTd_cours());
ps.setDouble(5, unCours.getnbExam_cours());
ps.setDouble(6, unCours.getnbAmphi_cours());
ps.setDouble(7, unCours.getnbTp_cours());
// Execution of the raquette
returnValue = ps.executeUpdate();
}
catch (Exception e) {
e.printStackTrace();
} finally {
// fermeture du preparedStatement et de la connexion
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
public int supprimerUnCours(Cours unCours) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM cours WHERE id_cours = ?");
ps.setInt(1, unCours.getId_cours());
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
public Cours get(int id_cours) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 Cours returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM cours WHERE id_cours = ?");
 ps.setInt(1, id_cours); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new Cours(rs.getInt("id_cours"),
rs.getDouble("masseHoraire_cours"),
 rs.getString("nom_cours"),
 rs.getDouble("nbTd_cours"),
rs.getDouble("nbExam_cours"),
rs.getDouble("nbAmphi_cours"),
 rs.getDouble("nbTp_cours"));
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
public ArrayList<Cours> getList() { 
Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<Cours> returnValue = new ArrayList<Cours>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM cours");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new Cours(rs.getInt("id_cours"),
rs.getDouble("masseHoraire_cours"),
rs.getString("nom_cours"),
rs.getDouble("nbTd_cours"),
rs.getDouble("nbExam_cours"),
rs.getDouble("nbAmphi_cours"),
rs.getDouble("nbTp_cours")));
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