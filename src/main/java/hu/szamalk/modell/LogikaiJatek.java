package hu.szamalk.modell;

import java.util.Arrays;

public class LogikaiJatek {
    private Babu[][] tabla = new Babu[4][5];
    private int[] sorrend = new int[10];
    private int babuDb;

    public LogikaiJatek() {
        //
    }

    public LogikaiJatek(int babuDb) {
        this.babuDb = babuDb;
    }
    public boolean van8FelettEro(){
        return false;
    }
    public void kezd(){}
    public void ment(){}
    public void vege(){}

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
