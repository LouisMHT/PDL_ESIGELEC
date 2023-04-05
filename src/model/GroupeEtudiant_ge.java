package model;
import java.util.*;
public class GroupeEtudiant_ge {
private int id_ge;
private int numero_ge;
private int capacite_ge;
private ArrayList<Etudiant_ett>listeEtudiant;
private ArrayList<Cours>listeCours;
private ArrayList<Planning_plan>listePlanning;
/*
 * constructor of class GroupeEtudiant_ge
 */
public GroupeEtudiant_ge (int id_ge, int numero_ge, int capacite_ge) {
this.id_ge = id_ge;
this.numero_ge = numero_ge;
this.capacite_ge = capacite_ge;
listeEtudiant = new ArrayList<>();
listeCours = new ArrayList<>();
listePlanning = new ArrayList<>();
}
/*
 * Getters and setters of attributes
 */
public int getId_ge() {
return id_ge;
}
public int getNumero_ge() {
return numero_ge;
}
public int getCapacite_ge() {
return capacite_ge;
}
public void setId_get(int id_ge) {
this.id_ge = id_ge;
}
public void setnumero_ge(int numero_ge) {
this.numero_ge = numero_ge;
}
public void setcapacite_ge(int capacite_ge) {
this.capacite_ge = capacite_ge;
}
/*
 * add a student
 */
public void ajouterUnEtudiant(Etudiant_ett unEtudiant) {
listeEtudiant.add(unEtudiant);
}
/*
 * modify a student
 */
public void modifierUnEtudiant(Etudiant_ett unEtudiant) {
listeEtudiant.set(capacite_ge, unEtudiant);
}
/*
 * delete a student
 */
public void supprimerUnEtudiant(Etudiant_ett unEtudiant) {
listeEtudiant.remove(unEtudiant);
}
/*
 * add a course
 */
public void ajouterUnCours(Cours unCours) {
listeCours.add(unCours);
}
/*
 * modify a course
 */
public void modifierUnCours(Cours unCours) {
listeCours.set(capacite_ge, unCours);
}
/*
 * delete a course
 */
public void supprimerUnCours(Cours unCours) {
listeCours.remove(unCours);
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
listePlanning.set(capacite_ge, unPlanning);
}
/*
 * delete in planning
 */
public void supprimerUnPlanning(Planning_plan unPlanning) {
listePlanning.remove(unPlanning);
}
/*
 * Display
 */
public void display() {
System.out.println(" "+id_ge+" "+numero_ge+" "+capacite_ge);
}
}