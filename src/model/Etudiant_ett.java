package model;
import java.util.*;
public class Etudiant_ett {
private int id_ett;
private String nom_ett;
private String prenom_ett;
private String filiere_ett;
private String mail_ett;
private String mdp_ett;
private int id_ge;
private ArrayList<Absence_abs>listeAbsence;
private ArrayList<GroupeEtudiant_ge>listeGroupeEtudiant;
/*
 * Constructor of class etudiant_ett
 */
public Etudiant_ett(int id_ett, String nom_ett, String prenom_ett, String 
filiere_ett,String mail_ett, String mdp_ett, int id_ge) {
this.id_ett = id_ett;
this.nom_ett = nom_ett;
this.prenom_ett = prenom_ett;
this.filiere_ett = filiere_ett;
this.mail_ett = mail_ett;
this.mdp_ett = mdp_ett;
this.id_ge = id_ge;
listeAbsence = new ArrayList<>();
listeGroupeEtudiant = new ArrayList<>();
}
/*
 * Getters and setters of attributes
 */
public String getNom_ett() {
return nom_ett;
}
public String getPrenom_ett() {
return prenom_ett;
}
public int getId_ett() {
return id_ett;
}
public int getId_ge() {
return id_ge;
}
public String getFiliere_ett() {
return filiere_ett;
}
public String getMail_ett() {
return mail_ett;
}
public String getMdp_ett() {
return mdp_ett;
}
public void setNom_ett(String nom_ett) {
this.nom_ett = nom_ett;
}
public void setPrenom_ett(String prenom_ett) {
this.prenom_ett = prenom_ett;
}
public void setId_ett(int id_ett) {
this.id_ett = id_ett;
}
public void setFiliere_ett(String filiere_ett) {
this.filiere_ett = filiere_ett;
}
public void setMail_ett(String mail_ett) {
this.mail_ett = mail_ett;
}
public void setMdp_ett(String mdp_ett) {
this.mdp_ett = mdp_ett;
}
/*
 * calculate the total number of absences
 */
public int totalAbsence() {
int sum = 0;
for (int i=0; i< listeAbsence.size(); i++) {
sum = sum+1;
}
return sum;
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
listeAbsence.set(id_ett, uneAbsence);
}
/*
 * delete an absence
 */
public void supprimerUneAbsence(Absence_abs uneAbsence) {
listeAbsence.remove(uneAbsence);
}
/*
 * add a student group
 */
public void ajouterGroupe(GroupeEtudiant_ge unGroupe) {
listeGroupeEtudiant.add(unGroupe);
}
/*
 * modify a student group
 */
public void modifierGroupe(GroupeEtudiant_ge unGroupe) {
listeGroupeEtudiant.set(id_ett, unGroupe);
}
/*
 * delete a student group
 */
public void supprimerGroupe(GroupeEtudiant_ge unGroupe) {
listeGroupeEtudiant.remove(unGroupe);
}
/*
 * Display
 */
public void display() {
System.out.println(" "+id_ett+" "+nom_ett+" "+prenom_ett+" "+" "+filiere_ett+" "+mail_ett+" "+mdp_ett);
}
}