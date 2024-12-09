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

    public void Elhelyez(){}
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
    public void UresOszlop(){}
    public void UresSor(){}
    public int UresOszlopokSzama(){return 0;}
    public int UresSorokSzama(){return 0;}
}

