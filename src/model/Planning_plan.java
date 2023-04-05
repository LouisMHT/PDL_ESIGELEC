package model;
import java.util.*;
public class Planning_plan {
private int id_plan;
private int semaine_plan;
private ArrayList<PeriodeFermeture_pf>listePeriodeFermeture;
private ArrayList<Seance_sea> listeSeance;
/*
 * Constructor of class Planning
 */
public Planning_plan(int id_plan, int semaine_plan, Enseignant_ens 
unEnseignant, Etudiant_ett unEtudiant) {
this.id_plan = id_plan;
this.semaine_plan = semaine_plan;
listeSeance = new ArrayList<>();
listePeriodeFermeture = new ArrayList<>();
}
/*
 * Getters and setter of attributes
 */
public int getId_plan() {
return id_plan;
}
public int getSemaine_plan() {
return semaine_plan;
}
public void setId_plan(int id_plan) {
this.id_plan = id_plan;
}
public void setSemaine_plan(int semaine_plan) {
this.semaine_plan = semaine_plan;
}
/*
 * add a periode fermeture
 */
public void ajouterUnPeriodeFermeture(PeriodeFermeture_pf 
unePeriodeFermeture) {
listePeriodeFermeture.add(unePeriodeFermeture);
}
/*
 * update a periode fermeture
 */
public void modifierUnPeriodeFermeture(PeriodeFermeture_pf 
unePeriodeFermeture) {
listePeriodeFermeture.set(id_plan, unePeriodeFermeture);
}
/*
 * delete a periode fermeture
 */
public void supprimerUnPeriodeFermeture(PeriodeFermeture_pf 
unePeriodeFermeture) {
listePeriodeFermeture.remove(unePeriodeFermeture);
}
/*
 * add a session to planning
 */
public void ajouterUnSeance(Seance_sea uneSeance) {
listeSeance.add(uneSeance);
}
/*
 * modify a session in planning
 */
public void modifierUnSeance(Seance_sea uneSeance) {
listeSeance.set(semaine_plan, uneSeance);
}
/*
 * delete a session in planning
 */
public void supprimerUnSeance(Seance_sea uneSeance) {
listeSeance.remove(uneSeance);
}
/*
 * display
 */
public void display() {
System.out.println(" "+id_plan+" "+semaine_plan);
}
}