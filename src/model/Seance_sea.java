package model;
import java.util.*;
public class Seance_sea {
private int id_sea;
private String salleDeClasse_sea;
private String type_sea;
private String nom_sea;
private Date date_sea;
private Heure heure_debut_sea;
private double duree_sea;
private String lien_sea;
private ArrayList<Absence_abs> listeAbsence;
private ArrayList<Planning_plan>listePlanning;
/*
 * constructor of class Seance
 */
public Seance_sea(int id_sea, String salleDeClasse_sea, String type_sea, 
String nom_sea, Date date_sea, Heure heure_debut_sea, double duree_sea, 
String lien_sea) {
this.id_sea = id_sea;
this.salleDeClasse_sea = salleDeClasse_sea;
this.type_sea = type_sea;
this.nom_sea = nom_sea;
this.date_sea = date_sea;
this.heure_debut_sea = heure_debut_sea;
this.duree_sea = duree_sea;
this.lien_sea = lien_sea;
listeAbsence= new ArrayList<>();
listePlanning = new ArrayList<>();
}
/*
 * Getters and setters of attributes
 */
public int getId_sea() {
return id_sea;
}
public String getNom_sea() {
return nom_sea;
}
public String getType_sea() {
return type_sea;
}
public Date getDate_sea() {
return date_sea;
}
public Heure getHeure_debut_sea() {
return heure_debut_sea;
}
public String getSalleDeClasse_sea() {
return salleDeClasse_sea;
}
public double getDuree_sea() {
return duree_sea;
}
public String getLien_sea() {
return lien_sea;
}
public void setId_sea(int id_sea) {
this.id_sea = id_sea;
}
public void setdate_sea(Date date_sea) {
this.date_sea = date_sea;
}
public void setHeure_debut_sea(Heure heure_debut_sea) {
this.heure_debut_sea = heure_debut_sea;
}
public void settype_sea(String type_sea) {
this.type_sea = type_sea;
}
public void setnom_sea(String nom_sea) {
this.nom_sea = nom_sea;
}
public void setSalleDeClasse_sea(String salleDeClasse_sea) {
this.salleDeClasse_sea = salleDeClasse_sea;
}
public void setDuree_sea(double duree_sea) {
this.duree_sea = duree_sea;
}
public void setLien_sea(String lien_sea) {
this.lien_sea = lien_sea;
}
/*
 * add an absence
 */
public void ajouterUneAbsence(Absence_abs uneAbsence) {
listeAbsence.add(uneAbsence);
}
/*
 * modify an absence
 */
public void modifierUneAbsence(Absence_abs uneAbsence) {
listeAbsence.set(0, uneAbsence);
}
/*
 * delete an absence
 */
public void supprimerUneAbsence(Absence_abs uneAbsence) {
listeAbsence.remove(uneAbsence);
}
/*
 * add in planning
 */
public void ajouterUnPlanning(Planning_plan unPlanning) {
listePlanning.add(unPlanning);
}
/*
 * modify in planning
 */
public void modifierUnPlanning(Planning_plan unPlanning) {
listePlanning.set(id_sea, unPlanning);
}
/*
 * delete in planning
 */
public void supprimerUnPlanning(Planning_plan unPlanning) {
listePlanning.remove(unPlanning);
}
/*
 * display
 */
public void display() {
System.out.println(" "+id_sea+" " +salleDeClasse_sea+" "+type_sea+" "+nom_sea +" "+date_sea+" "+heure_debut_sea+" "+duree_sea+" "+lien_sea);
}
}