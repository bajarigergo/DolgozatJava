package hu.szamalk.modell;

import java.util.Random;

public class Tabla {
    Random rnd = new Random();
    private String UresCella;
    private String[][] T;

    public Tabla(String uresCella) {
        T = new String[8][8];
        UresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            T [i] = new String[]{UresCella,UresCella,UresCella,UresCella,UresCella,UresCella,UresCella,UresCella};
        }
    }

    public void Elhelyez(int N){
        for (int i = 0; i < N; i++) {
            int randomI = rnd.nextInt(8);
            int randomJ = rnd.nextInt(8);
            if(T[randomI][randomJ]!="K"){
                T[randomI][randomJ]="K";
            }else{
            i--;}
        }
    }
    public void FajlbaIr(){}
    public void Megjelenit(){
        String kimenet="";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                kimenet+=T[i][j];
            }
            kimenet +="\n";
        }
        System.out.println(kimenet);
    }
    public boolean UresOszlop(int oszlopszam){
        int i = 0;
        while ((i < 8) && (T[i][oszlopszam] == UresCella)){
            i++;
        }
        return i>=8;
    }
    public boolean UresSor(int sorszam){
        int i = 0;
        while ((i < 8) && (T[sorszam][i] == UresCella)){
            i++;
        }
        return i>=8;
    }
    public int UresOszlopokSzama(){
        int gyujto = 0;
        for (int i = 0; i < 8; i++) {
            if(UresOszlop(i)){
                gyujto++;
            }
        }
        return gyujto;
    }
    public int UresSorokSzama(){
        int gyujto = 0;
        for (int i = 0; i < 8; i++) {
            if(UresSor(i)){
                gyujto++;
            }
        }
        return gyujto;
    }
}

