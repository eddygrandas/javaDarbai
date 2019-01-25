package com.company;

public class Azuolas extends Lapuotis {
    @Override
    public boolean laikasKirsti(){
        super.laikasKirsti();
        if(super.getMetai()>10 && super.getPalaistyta()> 2500){
            return true;
        }else{
            return false;        }
    }
}
