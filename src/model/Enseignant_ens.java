package model;
import java.util.*;
public class Enseignant_ens {
private int id_ens;
private String nom_ens;
private String prenom_ens;
private String numeroTel_ens;
private String mail_ens;
private String mdp_ens;
private ArrayList<Absence_abs> listeAbsence;
private ArrayList<Planning_plan> listePlanning;
/*
 * Constructor of class Enseignant_ens
 */
public Enseignant_ens (int id_ens, String nom_ens, String prenom_ens, 
String numeroTel_ens, String mail_ens, String mdp_ens) {
this.id_ens = id_ens;
this.nom_ens =nom_ens;
this.prenom_ens = prenom_ens;
this.numeroTel_ens = numeroTel_ens;
this.mail_ens = mail_ens;
this.mdp_ens = mdp_ens;
listeAbsence = new ArrayList<>();
listePlanning = new ArrayList<>();
}
// getter and setters of attributes
public int getId_ens() {
return id_ens;
}
public String getNom() {
return nom_ens;
}
public String getPrenom() {
return prenom_ens;
}
public int getIdEnseignant() {
return id_ens;
}
public String getNumeroTel() {
return numeroTel_ens;
}
public String getMail() {
return mail_ens;
}
public String getMdp() {
return mdp_ens;
}
public void setId_ens(int id_ens) {
this.id_ens = id_ens;
}
public void setNom(String nom_ens) {
this.nom_ens = nom_ens;
}
public void setPrenom(String prenom_ens) {
this.prenom_ens = prenom_ens;
}
public void setNumeroTel(String numeroTel_ens) {
this.numeroTel_ens = numeroTel_ens;
}
public void setMail(String mail_ens) {
this.mail_ens = mail_ens;
}
public void setMdp(String mdp_ens) {
this.mdp_ens = mdp_ens;
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
listeAbsence.set(id_ens, uneAbsence);
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
listePlanning.set(id_ens, unPlanning);
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
System.out.println(" "+id_ens+" "+nom_ens +" "+prenom_ens +" " 
+numeroTel_ens + " "+mail_ens);
}
}
