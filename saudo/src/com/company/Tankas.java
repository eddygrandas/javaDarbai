package com.company;

        import java.util.ArrayList;

public class Tankas {

    int kryptis=0;
    int pozX=0;
    int pozY=0;
    int sovinys=0;
    ArrayList<String> arrayList=new ArrayList<>();
    String koordX, koordY, krypText, elementas, movText, pozText;


    public void pirmyn(){
        if (kryptis%4==0 || kryptis%4==-4){
            pozY++;
            movText=("Vaziuoja i siaure");
        }
        if (kryptis%4==1 || kryptis%4==-3){
            pozX++;
            movText=("Vaziuoja i rytus");
        }
        if (kryptis%4==2 || kryptis%4==-2){
            pozY--;
            movText=("Vaziuoja i pietus");
        }
        if (kryptis%4==3 || kryptis%4==-1){
            pozX--;
            movText=("Vaziuoja i vakarus");
        }
        System.out.println(movText);
    }

    public void atgal(){
        if (kryptis%4==0 || kryptis%4==-4){
            pozY--;
            movText=("Vaziuoja atbulomis i pietus");
        }
        if (kryptis%4==1 || kryptis%4==-3){
            pozX--;
            movText=("Vaziuoja atbulomis i vakarus");
        }
        if (kryptis%4==2 || kryptis%4==-2){
            pozY++;
            movText=("Vaziuoja atbulomis i siaure");
        }
        if (kryptis%4==3 || kryptis%4==-1){
            pozX++;
            movText=("Vaziuoja atbulomis i rytus");
        }
        System.out.println(movText);
    }

    public void kairen(){
        kryptis--;
        System.out.println("Suka kairen");
    }

    public void desinen(){
        kryptis++;
        System.out.println("Suka desinen");
    }

    public void suvis(){
        System.out.println("Suvis");
        elementas="| Suvis nr: "+(sovinys+1)+" - "+pozicija()+" | "+ koordinates() +"|";
        arrayList.add(sovinys, elementas);
        sovinys++;
    }

    public String pozicija(){
        if (pozX>0){
            koordX=("Rytai: "+pozX);
        }else{
            koordX=("Vakarai: "+Math.abs(pozX));
        }
        if (pozY>0){
            koordY=("Siaure: "+pozY);
        }else{
            koordY=("Pietus: "+Math.abs(pozY));
        }
        pozText=(koordX+"\n"+koordY);
        return pozText;
    }

    public String koordinates(){
        if (kryptis%4==0 || kryptis%4==-4){
            krypText=("Kryptis siaure");
        }
        if (kryptis%4==1 || kryptis%4==-3) {
            krypText=("Kryptis rytai");
        }
        if (kryptis%4==2 || kryptis%4==-2){
            krypText=("Kryptis pietus");
        }
        if (kryptis%4==3 || kryptis%4==-1){
            krypText=("Kryptis vakarai");
        }
        return krypText;
    }

    public void info(){
        System.out.println("--------------");
        System.out.println("Tanko pozicija: ");
        System.out.println(koordinates());
        System.out.println(pozicija());
        System.out.println("Issauta: "+arrayList.size()+" kartu(s)");
        for(String str:arrayList){
            System.out.println(str);}
        System.out.println("--------------");
    }
}

