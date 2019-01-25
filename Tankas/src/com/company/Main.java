package com.company;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Tankas tankas = new Tankas();

        tankas.desinen();
        tankas.pirmyn();
        tankas.suvis();
        tankas.desinen();
        tankas.pirmyn();
        tankas.pirmyn();
        tankas.suvis();
        tankas.info();
    }

    private class Meniu {

        ArrayList<String> komandos;

        {
            komandos = new ArrayList<String>();


            komandos.add("[s]-ejimas i Siaure");
            komandos.add("[r]-ejimas i Rytus");
            komandos.add("[p]-ejimas i Pietus");
            komandos.add("[v]-ejimas i Vakarus");
            komandos.add("[i]-info");
            komandos.add("[x]-iseiti");

            for (String kmd : komandos)
                System.out.println("Pasirinkite :" + kmd);

            System.out.println(System.currentTimeMillis());


        }


    }

}
