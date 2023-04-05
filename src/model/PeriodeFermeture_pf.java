package model;
public class PeriodeFermeture_pf {
private int id_pf;
private String motif_pf;
private Date date_debut_pf;
private double duree_pf;
/*
 * Constructor of class PeriodeFermeture_pf
 */
public PeriodeFermeture_pf(int id_pf, String motif_pf, Date date_debut_pf, double duree_pf) {
this.id_pf = id_pf;
this.motif_pf = motif_pf;
this.date_debut_pf = date_debut_pf;
this.duree_pf = duree_pf;
}
/*
 * Getters and setters of attributes
 */
public int getId_pf() {
return id_pf;
}
public String getMotif_pf() {
return motif_pf;
}
public Date getDate_debut_pf() {
return date_debut_pf;
}
public double getDuree_pf() {
return duree_pf;
}
public void setId_pf(int id_pf) {
this.id_pf = id_pf;
}
public void setMotif_pf(String motif_pf) {
this.motif_pf = motif_pf;
}
public void setDate_debut_pf(Date date_debut_pf) {
this.date_debut_pf = date_debut_pf;
}
public void setDuree_pf(double duree_pf) {
this.duree_pf = duree_pf;
}
/*
 * display
 */
public void display() {
System.out.println(" "+id_pf+" "+motif_pf+" "+date_debut_pf+" "+duree_pf);
}
}
