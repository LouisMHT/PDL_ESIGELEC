package model;
import java.util.*;
public class Cours {
private int id_cours;
private double masseHoraire_cours;
private String nom_cours;
private double nbTd_cours;
private double nbExam_cours;
private double nbAmphi_cours;
private double nbTp_cours;
private ArrayList<GroupeEtudiant_ge> listeGroupeEtudiant;
private ArrayList<Planning_plan> listePlanning;
private ArrayList<Enseignant_ens> listeEnseignant;
/*
 * constructor of class Cours
 */
public Cours(int id_cours, double masseHoraire_cours, String 
nom_cours, double nbTd_cours, double nbExam_cours, double
nbAmphi_cours, double nbTp_cours) {
this.id_cours = id_cours;
this.masseHoraire_cours = masseHoraire_cours;
this.nom_cours = nom_cours;
this.nbTd_cours = nbTd_cours;
this.nbExam_cours = nbExam_cours;
this.nbAmphi_cours = nbAmphi_cours;
this.nbTp_cours = nbTp_cours;
listeGroupeEtudiant = new ArrayList<>();
listePlanning = new ArrayList<>();
listeEnseignant = new ArrayList<>();
}
/*
 * Getters and setters of attributes
 */
public String getnom_cours() {
return nom_cours;
}
public int getId_cours() {
return id_cours;
}
public double getmasseHoraire_cours() {
return masseHoraire_cours;
}
public double getnbTd_cours() {
return nbTd_cours;
}
public double getnbExam_cours() {
return nbExam_cours;
}
public double getnbAmphi_cours() {
return nbAmphi_cours;
}
public double getnbTp_cours() {
return nbTp_cours;
}
public void setId_cours(int id_cours) {
this.id_cours = id_cours;
}
public void setnom_cours(String nom_cours) {
this.nom_cours = nom_cours;
}
public void setmasseHoraire_cours(double masseHoraire_cours) {
this.masseHoraire_cours = masseHoraire_cours;
}
public void setnbTd_cours(double nbTd_cours) {
this.nbTd_cours = nbTd_cours;
}
public void setnbExam_cours(double nbExam_cours) {
this.nbExam_cours = nbExam_cours;
}
public void setnbAmphi_cours(double nbAmphi_cours) {
this.nbAmphi_cours = nbAmphi_cours;
}
public void setnbTp_cours(double nbTp_cours) {
this.nbTp_cours = nbTp_cours;
}
/*
 * add a student group
 */
public void ajouterUnGroupe(GroupeEtudiant_ge unGroupe) {
listeGroupeEtudiant.add(unGroupe);
}
/*
 * modify a student group
 */
public void modifierUnGroupe(GroupeEtudiant_ge unGroupe) {
listeGroupeEtudiant.set(0, unGroupe);
}
/*
 * delete a student group
 */
public void supprimerUnGroupe(GroupeEtudiant_ge unGroupe) {
listeGroupeEtudiant.remove(unGroupe);
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
listePlanning.set(0, unPlanning);
}
/*
 * delete in planning
 */
public void supprimerUnPlanning(Planning_plan unPlanning) {
listePlanning.remove(unPlanning);
}
/*
 * add a teacher
 */
public void ajouterUnEnseignant(Enseignant_ens unEnseignant) {
listeEnseignant.add(unEnseignant);
}
/*
 * modify a teacher
 */
public void modifierUnEnseignant(Enseignant_ens unEnseignant) {
listeEnseignant.set(0, unEnseignant);
}
/*
 * delete a teacher
 */
public void supprimerUnEnseignant(Enseignant_ens unEnseignant) {
listeEnseignant.remove(unEnseignant);
}
/*
 * display
 */
public void display() {
System.out.println(" "+id_cours+" " +masseHoraire_cours+" "+nom_cours+" "+nbTd_cours+" "+nbExam_cours+" "+nbAmphi_cours+" "+nbTp_cours);
}
}
