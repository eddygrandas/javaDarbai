package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min=Integer.MAX_VALUE;
        int max=0;
        Scanner skaicius= new Scanner(System.in);
        for (int i = 0; i<10; i++){
        System.out.println("Iveskite skaiciu: ");
        int ivestasSkaicius=skaicius.nextInt();
            if (ivestasSkaicius<min) {
                min=ivestasSkaicius;
            }else if (ivestasSkaicius>max){
                max=ivestasSkaicius;
            }
    }
        System.out.println("Didziausias skaicius: "+max+"\n"+"Maziausias skaicius: "+min);}
}
