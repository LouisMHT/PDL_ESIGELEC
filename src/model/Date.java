package model;
public class Date {
private int jour;
private String mois;
private int annee;
/*
 * Constructor of class Date
 */
public Date(int jour, String mois, int annee) {
this.jour = jour;
this.mois = mois;
this.annee = annee;
}
/*
 * getters and setters of attributes
 */
public int getJour() {
return jour;
}
public String getMois() {
return mois;
}
public int getAnnee() {
return annee;
}
public void setJour(int jour) {
this.jour = jour;
}
public void setMois(String mois) {
this.mois = mois;
}
public void setAnnee(int annee) {
this.annee = annee;
}
/*
 * Display
 */
public void disply() {
System.out.println(" "+jour+ " "+mois+" "+annee);
}
}