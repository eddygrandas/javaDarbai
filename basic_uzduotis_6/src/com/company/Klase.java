package com.company;

import java.util.Scanner;

public class Klase {
   public static double m1(){
       double d1=15.3;
       double d2=75.9;
       System.out.println(d1+d2);
       return d1+d2;
   }
    public static double m2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite double skaiciu: ");
        double a = sc.nextDouble();
        System.out.println(a);
        return a;
    }

}
