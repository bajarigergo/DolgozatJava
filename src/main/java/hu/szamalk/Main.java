package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla program = new Tabla("#");
        program.Elhelyez(8);
        //program.Megjelenit();
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: "+program.UresOszlopokSzama());
        System.out.println("Sorok: "+program.UresSorokSzama());
    }
}