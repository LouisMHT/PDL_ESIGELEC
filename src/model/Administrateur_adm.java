package model;
public class Administrateur_adm {
private int id_adm;
private String function_adm;
private String mail_adm;
private String mdp_adm;
/*
 * Constructor of class Administrateur_adm
 */
public Administrateur_adm(int id_adm, String function_adm, String 
mail_adm, String mdp_adm) {
this.id_adm = id_adm;
this.function_adm = function_adm;
this.mail_adm = mail_adm;
this.mdp_adm = mdp_adm;
}
/*
 * Getters and setters of attributes
 */
public int getId_adm() {
return id_adm;
}
public String getFunction_adm() {
return function_adm;
}
public String getMail_adm() {
return mail_adm;
}
public String getMdp_adm() {
return mdp_adm;
}
public void setId_adm(int id_adm) {
this.id_adm = id_adm;
}
public void setFunction(String function_adm) {
this.function_adm = function_adm;
}
public void setMail_adm(String mail_adm) {
this.mail_adm = mail_adm;
}
public void setMdo_adm(String mdp_adm) {
this.mdp_adm = mdp_adm;
}
public void display() {
System.out.println(" "+id_adm+" "+function_adm+" "+mail_adm);
}
}