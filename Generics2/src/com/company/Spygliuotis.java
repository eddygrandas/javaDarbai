package com.company;

public class Spygliuotis implements Medis{
    String rusis= "spygliuotis";

    @Override
    public void turi() {

            String lapas="turi spyglius";
            System.out.println(getClass().getSimpleName()+" "+lapas);

    }
}
