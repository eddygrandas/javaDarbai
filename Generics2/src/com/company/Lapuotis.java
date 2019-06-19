package com.company;

public class Lapuotis implements Medis{
    String rusis="Lapuotis";

    @Override
    public void turi() {

            String lapas="turi lapus";
            System.out.println(getClass().getSimpleName()+" "+lapas);

    }
}
