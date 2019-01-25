package com.company;

import java.util.ArrayList;

public class NutolesDiskas implements Saugykla{
    private ArrayList<Info> listas;

    public NutolesDiskas(){
        listas = new ArrayList<>();
    }
    @Override
    public void saugotiInfo(Info info) {
        listas.add(info);
        System.out.println("Issaugota i nutolusi diska");
    }

    @Override
    public Info rastiInfo(int id) {

        for(Info infoIsListo: listas){
            if(infoIsListo.getId()==id){
                System.out.println("Rasta nutolusiame diske pagal id");
                return null;
            }
        }
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        System.out.println("Rasta nutolusiame diske pagal zodi");
        for(Info infoIsListo: listas){
            if(infoIsListo.getTekstas()==zodis){
                System.out.println("Rasta nutolusiame diske pagal id");
                return null;
    }
}return null;}}
