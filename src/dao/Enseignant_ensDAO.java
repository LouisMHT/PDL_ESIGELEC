package dao;
import java.util.*;
import java.sql.*;
import model.Enseignant_ens;
public class Enseignant_ensDAO extends ConnectionDAO {
public Enseignant_ensDAO() {
super();
}
public int ajouterUnEnseignant(Enseignant_ens unEnseignant) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO enseignant_ens(id_ens, nom_ens, prenom_ens, numeroTel_ens, mail_ens, mdp_ens) VALUES (?, ?, ?, ?, ?, ?)");
ps.setInt(1, unEnseignant.getId_ens());
ps.setString(2, unEnseignant.getNom());
ps.setString(3, unEnseignant.getPrenom());
ps.setString(4, unEnseignant.getNumeroTel());
ps.setString(5, unEnseignant.getMail());
ps.setString(6, unEnseignant.getMdp());
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
public int modifierUnEnseignant(Enseignant_ens unEnseignant) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unEnseignant set nom_ens = ?, prenom_ens = ?, numeroTel_ens = ?, mail_ens = ?, mdp_ens = ? WHERE id_ens = ?");
ps.setInt(1, unEnseignant.getId_ens());
ps.setString(2, unEnseignant.getNom());
ps.setString(3, unEnseignant.getPrenom());
ps.setString(4, unEnseignant.getNumeroTel());
ps.setString(5, unEnseignant.getMail());
ps.setString(6, unEnseignant.getMdp());
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
public int supprimerUnEnseignant(Enseignant_ens unEnseignant) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM enseignant_ens WHERE id_ens = ?");
ps.setInt(1, unEnseignant.getId_ens());
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
public Enseignant_ens get(int id_ens) {
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
 Enseignant_ens returnValue = null; 
try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM enseignant_ens WHERE id_ens = ?");
 ps.setInt(1, id_ens); 
 rs = ps.executeQuery(); 
if (rs.next()) {
 returnValue = new Enseignant_ens(rs.getInt("id_ens"),
rs.getString("nom_ens"),
rs.getString("prenom_ens"),
rs.getString("numeroTel_ens"),
rs.getString("mail_ens"),
rs.getString("mdp_ens"));
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
public ArrayList<Enseignant_ens> getList() { 
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
 ArrayList<Enseignant_ens> returnValue = new
ArrayList<Enseignant_ens>(); 
try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM enseignant_ens");
 rs = ps.executeQuery(); 
while (rs.next()) {
 returnValue.add(new Enseignant_ens(rs.getInt("id_ens"),
rs.getString("nom_ens"),
rs.getString("prenom_ens"),
rs.getString("numeroTel_ens"),
rs.getString("mail_ens"),
rs.getString("mdp_ens")));
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