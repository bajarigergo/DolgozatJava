package hu.szamalk.modell;

public abstract class Jatek {
    private static int jatekDb = 0;

    public static int getJatekDb() {
        return jatekDb;
    }
    public abstract void kezd();
    public abstract void ment();
    public abstract void vege();

}
