package com.company;

public class Main {

    public static void main(String[] args) {

        int p = 1;
        int bet= 1;
        int money_spent = 990;
        //boolean lose = Math.random() < 0.5;
boolean lose= false;

//
        for (int i = 0; i < 100; i++) {
            double a=(Math.random()+0.5);
            if (a<=1){
                lose= true;
                p-=bet;
                bet*=2;

            }else{
                lose=false;
                p=p+2*bet;

            }
            System.out.println("laimejo:"+p+" suma: "+bet);
        }

        System.out.println(p);
        System.out.println(bet);

    }


    }




