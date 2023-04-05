package dao;
import java.util.*;
import java.sql.*;
import model.GroupeEtudiant_ge;
public class GroupeEtudiant_geDAO extends ConnectionDAO{
public GroupeEtudiant_geDAO() {
super();
}
public int ajouterGroupe(GroupeEtudiant_ge unGroupe) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO groupeetudiant_ge(id_ge, numero_ge, capacite_ge) VALUES (?, ?, ?)");
ps.setInt(1, unGroupe.getId_ge());
ps.setInt(2, unGroupe.getNumero_ge());
ps.setInt(3, unGroupe.getCapacite_ge());
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
public int modifierGroupe(GroupeEtudiant_ge unGroupe) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unGroupet set numero_ge = ?, capacite_ge = ? WHERE id_ge = ?");
ps.setInt(1, unGroupe.getNumero_ge());
ps.setInt(2, unGroupe.getCapacite_ge());
ps.setInt(3, unGroupe.getId_ge());
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
public int supprimerGroupe(GroupeEtudiant_ge unGroupe) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM groupeetudiant_ge WHERE id_ge = ?");
ps.setInt(1, unGroupe.getId_ge());
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
public GroupeEtudiant_ge get(int id_ge) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 GroupeEtudiant_ge returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM groupeetudiant_ge WHERE id_ge = ?");
 ps.setInt(1, id_ge); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new GroupeEtudiant_ge(rs.getInt("id_ge"),
rs.getInt("nomero_ge"),
rs.getInt("capacite_ge"));
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
public ArrayList<GroupeEtudiant_ge> getList() { 
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<GroupeEtudiant_ge> returnValue = new 
ArrayList<GroupeEtudiant_ge>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM groupeetudiant_ge");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new 
GroupeEtudiant_ge(rs.getInt("id_ge"),
rs.getInt("nomero_ge"),
rs.getInt("capacite_ge")));
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