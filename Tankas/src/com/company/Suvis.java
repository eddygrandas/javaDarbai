package com.company;

public class Suvis {
    private static int skSiaure;
    private static int skRytai;
    private static int skPietus;
    private static int skVakarai;

    private String suvioKryptis = "";

    Suvis(int kryptis) {
        if (kryptis == 0) {
            this.suvioKryptis = "Siaure";
            skSiaure++;
        }
        if (kryptis == 1) {
            this.suvioKryptis = "Rytai";
            skRytai++;
        }
        if (kryptis == 2) {
            this.suvioKryptis = "Pietus";
            skPietus++;
        }
        if (kryptis == 3) {
            this.suvioKryptis = "Vakarai";
            skVakarai++;
        }
    }

    public static int getSkSiaure() {
        return skSiaure;
    }

    public static int getSkRytai() {
        return skRytai;
    }

    public static int getSkPietus() {
        return skPietus;
    }

    public static int getSkVakarai() {
        return skVakarai;
    }

    public int isVisoSuviu() {
        return skVakarai + skRytai + skSiaure + skPietus;
    }
}
