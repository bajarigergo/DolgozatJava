package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla program = new Tabla("#");
        program.Elhelyez(8);
        System.out.println("6. feladat: a feltöltött tábla");
        program.Megjelenit();
    }
}