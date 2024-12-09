package hu.szamalk.modell;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if ((2<=babuDb) && (babuDb<=15)){
            this.babuDb = babuDb;
        }else{
            this.babuDb=3;
        }
        tabla = new Babu[4][5];
        sorrend = new int[10];
    }
    public boolean van8FelettEro(){
        return false;
    }
    public void kezd(){
        System.out.println("Kezdés");
    }
    public void ment(){
        System.out.println("Mentés");
    }
    public void vege(){
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                ", babuDb=" + babuDb +
                '}';
    }
}
