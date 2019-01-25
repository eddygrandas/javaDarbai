package com.company;
import java.util.Random;
public class Medis {

    private int metai=0;
    private int palaistyta=0;
    private boolean kirsti;
    private String bam;

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public int getPalaistyta() {
        return palaistyta;
    }

    public void setPalaistyta(int palaistyta) {
        this.palaistyta = palaistyta;
    }

    public boolean isKirsti() {
        return kirsti;
    }

    public void setKirsti(boolean kirsti) {
        this.kirsti = kirsti;
    }

    public void auginti(){
        metai = (int)(Math.random() * 30);
        palaistyta = (int)(Math.random() * 5000);
        System.out.println("Augo "+metai+" metu");
        System.out.println("palaistytas "+palaistyta+" litru");
    }

    public void laistyti(int litrai){

        System.out.println(litrai);
    }
    public boolean laikasKirsti(){
        if (metai>=10 && palaistyta>=2000){
            kirsti = true;
            //bam =("Galima kirsti "+kirsti);
        }else {
            kirsti = false;
            //bam =("Negalima kirsti "+kirsti);}
        }return kirsti;

    }
    public void informacija(){


    }
}
