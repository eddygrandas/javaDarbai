package com.company;

public class Spygliuotis extends Medis{
    public void lapai(){
        System.out.println("Lapai spyglio formos");
    }
    @Override
    public boolean laikasKirsti(){
        super.laikasKirsti();
        if(super.getMetai()>8 && super.getPalaistyta()> 2000){
            return true;
        }else{
            return false;        }
    }}
