package hu.szamalk;

import hu.szamalk.modell.LogikaiJatek;
import hu.szamalk.modell.Tabla;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LogikaiJatek j1 = new LogikaiJatek(3);
        LogikaiJatek j2 = new LogikaiJatek(10);

//        Tabla t = new Tabla("#");
//        System.out.println("4. feladat: az üres tábla:");
//        t.Megjelenit();
//
//        System.out.println("6.feladat: A feltöltött tábla:");
//        t.Elhelyez(8);
//        t.Megjelenit();
//
//        System.out.println("9.feladat: Üres oszlopok és sorok száma:");
//        System.out.println("Oszlopok: "+ t.UresOszlopokSzama());
//        System.out.println("Sorok: " +t.UresSorokSzama());
//
//        String kimenet = "";
//        for (int i = 0; i < 64; i++) {
//            Tabla tabla = new Tabla("*");
//            tabla.Elhelyez(i+1);
//            kimenet += tabla.FajlbaIr() +"\n";
//        }
//        try {
//            File myObj = new File("tablak64.txt");
//            if (myObj.createNewFile()) {
//                FileWriter myWriter = new FileWriter(myObj);
//                myWriter.write(kimenet);
//                myWriter.close();
//            } else {
//                myObj.delete();
//                FileWriter myWriter = new FileWriter(myObj);
//                myWriter.write(kimenet);
//                myWriter.close();
//                /*FileWriter myWriter = new FileWriter(myObj);
//                myWriter.write(kimenet);
//                myWriter.close();*/
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}