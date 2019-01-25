package com.company;

public class Lapuotis extends Medis{
public void lapai(){
    System.out.println("Lapai lapo formos");
}
    @Override
    public boolean laikasKirsti(){
        super.laikasKirsti();
        if(super.getMetai()>10 && super.getPalaistyta()> 2500){
           return true;
        }else{
            return false;        }
    }}

