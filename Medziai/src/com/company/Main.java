package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int litrai = 100;
        Medis medis = new Medis();
        Lapuotis lapuotis = new Lapuotis();
        Azuolas azuolas= new Azuolas();
        Uosis uosis = new Uosis();
        medis.auginti();
        medis.laistyti(litrai);
        azuolas.laikasKirsti();
        uosis.informacija();
    }
}
