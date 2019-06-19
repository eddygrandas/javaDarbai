package com.company;

public class Payments {
    private int mokeijimoID;
    private int suma;
    private int gavejoID;
    private int siuntejoID;

    public Payments(int mokeijimoID, int suma, int gavejoID, int siuntejoID) {
        this.mokeijimoID = mokeijimoID;
        this.suma = suma;
        this.gavejoID = gavejoID;
        this.siuntejoID = siuntejoID;
    }

    public int getMokeijimoID() {
        return mokeijimoID;
    }

    public int getSuma() {
        return suma;
    }

    public int getGavejoID() {
        return gavejoID;
    }

    public int getSiuntejoID() {
        return siuntejoID;
    }
}
