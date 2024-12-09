package hu.szamalk.modell;

public class Tabla {
    private String UresCella;
    private String[][] T;

    public Tabla(String uresCella) {
        T = new String[8][8];
        UresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            T [i] = new String[]{UresCella,UresCella,UresCella,UresCella,UresCella,UresCella,UresCella,UresCella};
        }
    }

    private void Elhelyez(){}
    private void FajlbaIr(){}
    private void Megjelenit(){}
    private void UresOszlop(){}
    private void UresSor(){}
    private int UresOszlopokSzama(){return 0;}
    private int UresSorokSzama(){return 0;}
}

