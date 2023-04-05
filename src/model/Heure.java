package model;
public class Heure {
private int heure;
private int minute;
/*
 * Constructor of class Heure
 */
public Heure(int heure, int minute) {
this.heure = heure;
this.minute = minute;
}
/*
 * Getters and setters of attributes
 */
public int getHeure() {
return heure;
}
public int getMinute() {
return minute;
}
public void setHeure(int heure) {
this.heure = heure;
}
public void setMinute(int minute) {
this.minute = minute;
}
/*
 * Display
 */
public void disply() {
System.out.println(" "+heure+ " "+minute);
}
}