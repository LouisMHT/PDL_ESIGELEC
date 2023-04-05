package dao;
import java.util.*;
import java.sql.*;
import model.Planning_plan;
public class Planning_planDAO extends ConnectionDAO{
public Planning_planDAO() {
super();
}
public int ajouterUnPlanning(Planning_plan unPlanning) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
//Connect to the database
try {
con = DriverManager.getConnection(URL,LOGIN,PASS);
ps = con.prepareStatement("INSERT INTO planning_plan(id_plan, semaine_plan) VALUES (?, ?)");
ps.setInt(1, unPlanning.getId_plan());
ps.setInt(2, unPlanning.getSemaine_plan());
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
public int modifierUnPlanning(Planning_plan unPlanning) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
//connect to the database
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("UPDATE unPlanningt set semaine_plan = ? WHERE id_plan = ?");
ps.setInt(1, unPlanning.getSemaine_plan());
ps.setInt(1, unPlanning.getId_plan());
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
public int supprimerUnPlanning(Planning_plan unPlanning) {
Connection con = null;
PreparedStatement ps = null;
int returnValue = 0;
try {
con = DriverManager.getConnection(URL, LOGIN, PASS);
ps = con.prepareStatement("DELETE FROM planning_plan WHERE id_plan = ?");
ps.setInt(1, unPlanning.getId_plan());
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
public Planning_plan get(int id_plan) {
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 Planning_plan returnValue = null; 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM planning_plan WHERE id_plan = ?");
 ps.setInt(1, id_plan); 
 rs = ps.executeQuery(); 
 if (rs.next()) {
 returnValue = new Planning_plan(rs.getInt("id_plan"),rs.getInt("semaine_plan"));
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
public ArrayList<Planning_plan> getList() { 
 Connection con = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
 ArrayList<Planning_plan> returnValue = new 
ArrayList<Planning_plan>(); 
 try {
 con = DriverManager.getConnection(URL, LOGIN, PASS);
 ps = con.prepareStatement("SELECT * FROM planning_plan");
 rs = ps.executeQuery(); 
 while (rs.next()) {
 returnValue.add(new Planning_plan(rs.getInt("id_plan"),rs.getInt("semaine_plan")));
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