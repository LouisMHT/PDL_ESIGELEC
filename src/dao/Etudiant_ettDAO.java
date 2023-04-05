package dao;
import java.util.*;
import java.sql.*;
import model.Etudiant_ett;
public class Etudiant_ettDAO extends ConnectionDAO{
public Etudiant_ettDAO() {
super();
}
public int ajouterUnEtudiant(Etudiant_ett unEtudiant) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO etudiant_ett(id_ett, nom_ett, prenom_ett, filiere_ett, mail_ett, mdp_ett, id_ge) VALUES (?, ?, ?, ?, ?, ?, ?)");
ps.setInt(1, unEtudiant.getId_ett());
ps.setString(2, unEtudiant.getNom_ett());
ps.setString(3, unEtudiant.getPrenom_ett());
ps.setString(4, unEtudiant.getFiliere_ett());
ps.setString(5, unEtudiant.getMail_ett());
ps.setString(6, unEtudiant.getMdp_ett());
ps.setInt(7, unEtudiant.getId_ge());
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
public int modifierUnEtudiant(Etudiant_ett unEtudiant) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE etudiant_ett set nom_ett = ?, prenom_ett = ?, filiere_ett = ?, mail_ett = ?, mdp_ett = ? WHERE id_ett = ?");
ps.setString(2, unEtudiant.getNom_ett());
ps.setString(3, unEtudiant.getPrenom_ett());
ps.setString(4, unEtudiant.getFiliere_ett());
ps.setString(5, unEtudiant.getMail_ett());
ps.setString(6, unEtudiant.getMdp_ett());
ps.setInt(1, unEtudiant.getId_ett());
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
public int supprimerUnEtudiant(Etudiant_ett unEtudiant) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM etudiant_ett WHERE id_ett = ?");
ps.setInt(1, unEtudiant.getId_ett());
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
public Etudiant_ett get(int id_ett) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 Etudiant_ett returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM etudiant_ett WHERE id_ett = ?");
 ps.setInt(1, id_ett); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new Etudiant_ett(rs.getInt("id_ett"),
rs.getString("nom_ett"),
rs.getString("prenom_ett"),
rs.getString("filiere_ett"),
rs.getString("mail_ett"),
rs.getString("mdp_ett"),
rs.getInt("id_ge"));
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
public ArrayList<Etudiant_ett> getList() { 
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<Etudiant_ett> returnValue = new ArrayList<Etudiant_ett>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM etudiant_ett");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new Etudiant_ett(rs.getInt("id_ett"),
rs.getString("nom_ett"),
rs.getString("prenom_ett"),
rs.getString("filiere_ett"),
rs.getString("mail_ett"),
rs.getString("mdp_ett"),rs.getInt("id_ge")));
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
