package hu.szamalk.modell;

public class Babu {
    private int ero;
    private String szin;

    public Babu(int ero, String szin) {
        if ((1<=ero) && (ero<=9)){
            this.ero = ero;
        }else{
            this.ero=1;
        }
        this.szin = szin;
    }
    public Babu(String szin) {
        this(1,szin);
    }
}
