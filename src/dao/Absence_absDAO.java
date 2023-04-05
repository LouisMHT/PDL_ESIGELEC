package dao;
import java.sql.*;
import java.util.*;
import model.Absence_abs;
public class Absence_absDAO extends ConnectionDAO{
public Absence_absDAO() {
super();
}
public int ajouterUneAbsence(Absence_abs uneAbsence) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//connect to the database
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("INSERT INTO Absence_abs (id_abs, motif_abs, jusstifiee_abs) VALUES (?,?,?)");
ps.setInt(1, uneAbsence.getId_abs());
ps.setString(3, uneAbsence.getmotif_abs());
ps.setString(3, uneAbsence.getJustifiee_abs());
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
public int modifierUneAbsence(Absence_abs uneAbsence) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE uneAbsence_abs set motif_abs = ?, justifiee_abs = ? WHERE id_abs = ?");
ps.setString(1, uneAbsence.getmotif_abs());
ps.setString(2, uneAbsence.getJustifiee_abs());
ps.setInt(3, uneAbsence.getId_abs());
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
public int supprimerUneAbsence(Absence_abs uneAbsence) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM absence_abs WHERE id_abs = ?");
ps.setInt(1, uneAbsence.getId_abs());
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
public Absence_abs get(int id_abs) {
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
 Absence_abs returnValue = null; 
try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM absence_abs WHERE id_abs = ?");
 ps.setInt(1, id_abs); 
 rs = ps.executeQuery(); 
if (rs.next()) {
 returnValue = new Absence_abs(rs.getInt("id_abs"),
rs.getDate("date"),
rs.getHeure("heure"),
rs.getString("motif_abs"),
rs.getString("justifiee_abs"),
rs.getSeance("seance"));
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
public ArrayList<Absence_abs> getList() { 
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
 ArrayList<Absence_abs> returnValue = new
ArrayList<Absence_abs>(); 
try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM absence_abs");
 rs = ps.executeQuery(); 
while (rs.next()) {
 returnValue.add(new
Absence_abs(rs.getInt("id_abs"),
rs.getDate("date"),
rs.getHeure("heure"),
rs.getString("motif_abs"),
rs.getString("justifiee_abs"),
rs.getSeance("seance")));
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