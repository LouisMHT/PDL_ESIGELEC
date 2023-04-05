package dao;
import java.util.*;
import java.sql.*;
import model.PeriodeFermeture_pf;
public class PeriodeFermeture_pfDAO extends ConnectionDAO {
public PeriodeFermeture_pfDAO() {
super();
}
public int ajouterUnPeriodeFermeture(PeriodeFermeture_pf 
unPeriodeFermeture) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO periodefermeture_pf(id_pf, motif_pf, date_debut_pf, duree_pf) VALUES (?, ?, ?, ?)");
ps.setInt(1, unPeriodeFermeture.getId_pf());
ps.setString(2, unPeriodeFermeture.getMotif_pf());
ps.setDouble(3, unPeriodeFermeture.getDate_debut_pf());
ps.setDouble(4, unPeriodeFermeture.getDuree_pf());
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
public int modifierUnPeriodeFermeture(PeriodeFermeture_pf 
unPeriodeFermeture) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unPeriodeFermeture set motif_pf = ?, date_debut_pf = ?, duree_pf = ? WHERE id_pf = ?");
ps.setString(1, unPeriodeFermeture.getMotif_pf());
ps.setDouble(2, unPeriodeFermeture.getDate_debut_pf());
ps.setDouble(3, unPeriodeFermeture.getDuree_pf());
ps.setInt(4, unPeriodeFermeture.getId_pf());
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
public int supprimerUnPeriodeFermeture(PeriodeFermeture_pf 
unPeriodeFermeture) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM periodefermeture_ge WHERE id_pf = ?");
ps.setInt(1, unPeriodeFermeture.getId_pf());
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
public PeriodeFermeture_pf get(int id_pf) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 PeriodeFermeture_pf returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM periodefermeture_pf WHERE id_pf = ?");
 ps.setInt(1, id_pf); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new PeriodeFermeture_pf(rs.getInt("id_pf"),
rs.getString("motif_pf"),
rs.getDate("date_debut_pf"),
rs.getDouble("duree_pf"));
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
public ArrayList<PeriodeFermeture_pf> getList() { 
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<PeriodeFermeture_pf> returnValue = new 
ArrayList<PeriodeFermeture_pf>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM periodefermeture_pf");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new 
PeriodeFermeture_pf(rs.getInt("id_pf"),
rs.getString("motif_pf"),
rs.getDouble("date_debut_pf"),
rs.getDouble("duree_pf")));
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