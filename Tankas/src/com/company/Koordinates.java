package com.company;


// 0 - siaure, 1 - rytai, 2 - pietus, 3 - vakarai

public class Koordinates {

    private int x = 2;
    private int y = 3;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String parodytiKoordinates() {
        String rezultatas = "";

        if (x > 0) {
            rezultatas += "Rytai: " + x + " ";
        } else {
            rezultatas += "Vakarai: " + x + " ";


            if (y > 0) {
                rezultatas += "Siaure: " + y + " ";
            } else {
                rezultatas += "Pietus: " + y + " ";
            }
            return rezultatas;
        }
        return rezultatas;
    }
}