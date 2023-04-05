package model;
import java.util.*;
public class Absence_abs {
private int id_abs;
private String motif_abs;
private String justifiee_abs;
private Seance_sea uneSeance;
private Date date;
private Heure heure;
private ArrayList<Etudiant_ett> listeEtudiant;
private ArrayList<Enseignant_ens> listeEnseignant;
/*
 * Constructor of class Absence
 */
public Absence_abs(int id_abs, String motif_abs,String justifiee_abs, 
Date date,Heure heure, Seance_sea uneSeance ) {
this.id_abs = id_abs;
this.motif_abs = motif_abs;
this.justifiee_abs = justifiee_abs;
this.uneSeance = uneSeance;
listeEtudiant = new ArrayList<>();
listeEnseignant = new ArrayList<>();
}
//getters and setters of attributes
public int getId_abs() {
return id_abs;
}
public Date getDate() {
return date;
}
public String getmotif_abs() {
return motif_abs;
}
public String getJustifiee_abs() {
return justifiee_abs;
}
public Heure getHeure() {
return heure;
}
public Seance_sea getseance() {
return uneSeance;
}
public void setId_abs(int id_abs) {
this.id_abs = id_abs;
}
public void setDate(Date date) {
this.date = date;
}
public void setmotif_abs(String motif_abs) {
this.motif_abs = motif_abs;
}
public void setJustifiee_abs(String justifiee_abs) {
this.justifiee_abs = justifiee_abs;
}
public void setHeure(Heure heure) {
this.heure = heure;
}
/*
 * add a student
 */
public void ajouterEtudiant(Etudiant_ett unEtudiant) {
listeEtudiant.add(unEtudiant);
}
/*
 * add a teacher
 */
public void ajouterEnseignant(Enseignant_ens unEnseignant) {
listeEnseignant.add(unEnseignant);
}
/*
 * display
 */
public void display() {
System.out.println("justifiee: "+justifiee_abs+"id_abs"+id_abs+ "motif_abs: "+motif_abs +"Date: "+date +"Heure: "+heure +"Seance: "+uneSeance);
}
}