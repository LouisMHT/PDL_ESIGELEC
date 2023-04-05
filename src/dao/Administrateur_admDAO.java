package dao;
import java.util.*;
import java.sql.*;
import model.Administrateur_adm;
public class Administrateur_admDAO extends ConnectionDAO {
public Administrateur_admDAO() {
super();
}
public int ajouterUnAdministrateur(Administrateur_adm unAdministrateur) 
{
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO administrateur_adm(id_adm, function_adm, mail_adm, mdp_adm) VALUES (?, ?, ?, ?)");
ps.setInt(1, unAdministrateur.getId_adm());
ps.setString(2, unAdministrateur.getFunction_adm());
ps.setString(3, unAdministrateur.getMail_adm());
ps.setString(4, unAdministrateur.getMdp_adm());
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
public int modifierUnAdministrateur(Administrateur_adm 
unAdministrateur) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unAdministrateur set function_adm = ?, mail_adm = ?, mdp_adm = ? WHERE id_adm = ?");
ps.setInt(1, unAdministrateur.getId_adm());
ps.setString(2, unAdministrateur.getFunction_adm());
ps.setString(3, unAdministrateur.getMail_adm());
ps.setString(4, unAdministrateur.getMdp_adm());
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
public int supprimerUnAdministrateur(Administrateur_adm 
unAdministrateur) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM administrateur_adm WHERE id_adm = ?");
ps.setInt(1, unAdministrateur.getId_adm());
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
public Administrateur_adm get(int id_adm) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 Administrateur_adm returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM administrateur_adm WHERE id_adm = ?");
 ps.setInt(1, id_adm); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new 
Administrateur_adm(rs.getInt("id_adm"),
rs.getString("function_adm"),
rs.getString("mail_adm"),
rs.getString("mdp_adm"));
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
public ArrayList<Administrateur_adm> getList() { 
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<Administrateur_adm> returnValue = new 
ArrayList<Administrateur_adm>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM administrateur_adm");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new 
Administrateur_adm(rs.getInt("id_adm"),
rs.getString("function_adm"),
rs.getString("mail_adm"),
rs.getString("mdp_adm")));
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
