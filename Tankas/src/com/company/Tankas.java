package com.company;

import java.util.ArrayList;

public class Tankas{

    Koordinates koordinates = new Koordinates();
    ArrayList<Suvis> suviai = new ArrayList<>();
    private int kryptis = 0; // 0 - siaure, 1 - rytai, 2 - pietus, 3 - vakarai

    public void pirmyn() {
        if (kryptis == 0) koordinates.setY(koordinates.getY() + 1);
        if (kryptis == 1) koordinates.setX(koordinates.getX() + 1);
        if (kryptis == 2) koordinates.setY(koordinates.getY() - 1);
        if (kryptis == 3) koordinates.setX(koordinates.getX() - 1);
    }

    public void kairen() {
        switch (kryptis) {
            case 0:
                kryptis = 3;
                break;
            case 1:
                kryptis = 0;
                break;
            case 2:
                kryptis = 1;
                break;
            case 3:
                kryptis = 2;
                break;
        }
    }

    public void desinen() {
        switch (kryptis) {
            case 0:
                kryptis = 1;
                break;
            case 1:
                kryptis = 2;
                break;
            case 2:
                kryptis = 3;
                break;
            case 3:
                kryptis = 0;
                break;
        }
        kryptis = kryptis >= 3 ? kryptis-- : kryptis++;
        System.out.println(kryptis);
    }

    public void suvis() {
        if (suviai.size() < 10) {
            suviai.add(new Suvis(kryptis));
        }
    }

    public String getKryptisZodziais() {
        if (kryptis == 0) return "Siaure";
        if (kryptis == 1) return "Rytai";
        if (kryptis == 2) return "Pietus";
        if (kryptis == 3) return "Vakarai";
        return null;
    }

    public void info() {
        System.out.println("INFO: Tanko koordinate: (" + koordinates.getX() + ";" + koordinates.getY() + "), kryptis: " + getKryptisZodziais());
        System.out.println("INFO: Tanko suviai: " + suviai.get(0).getSkSiaure() + " i Siaure, " + suviai.get(0).getSkRytai() + " i Rytus, " + suviai.get(0).getSkPietus() + " i Pietus, " + suviai.get(0).getSkVakarai() + " i Vakarus. Is viso suviu:" + suviai.get(0).isVisoSuviu());
    }

}
