package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(addTwo(5,8));
        greater(5,7);
        printMultiTable(5);
        divisibleBy();
        printPrime();



        Shape shape= new Shape("yellow", "bbz");
        System.out.println(shape.getColor());
        shape.setColor("red");
        System.out.println(shape.toString());

Circle circle=new Circle("orange", "A circle", 6);
        System.out.println(circle.toString());
    }
/////////////////////////////////////////////////////////////////////////////////////
// suma
/////////////////////////////////////////////////////////////////////////////////////

    public static int addTwo(int x, int y)
    {
        return x+y;
    }
/////////////////////////////////////////////////////////////////////////////////////
// ar didesnis
/////////////////////////////////////////////////////////////////////////////////////
    public static void greater(int x, int y)
    {
        String atsakymas;
        if (x>y){
            System.out.println(x+" daugiau uz "+y);
        }else{
            System.out.println(y+" daugiau uz "+x);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////
// daugybes lentele
/////////////////////////////////////////////////////////////////////////////////////
    public static void printMultiTable(int lim)
    {
        for (int i=0; i<=lim;i++){
            for (int j=0; j<=lim;j++){
               int x=i*j;
                System.out.println(x);
            }
            System.out.println("naujas");
        }
    }
/////////////////////////////////////////////////////////////////////////////////////
// dalijasi is 3 ir is 5, is 3, is 5
/////////////////////////////////////////////////////////////////////////////////////
    public static void divisibleBy()
    {
        int i;
        for(i=1; i<100; i++){
            if (i%3==0 && i%5==0){
                System.out.println(i+": dalijasi ir is 3 ir is 5");
            }else if ( i%5==0){
                System.out.println(i+": dalijasi is 5");
            }else if (i%3==0 ){
                System.out.println(i+": dalijasi is 3");
            }
        }
    }
/////////////////////////////////////////////////////////////////////////////////////
// pirminiai skaiciai
/////////////////////////////////////////////////////////////////////////////////////
    public static void printPrime() {
        int i,j;
        for (i=1; i<100; i++)
        {
            if (i==2){
                System.out.println(i);
            }
            for(j=2; j<i;j++)
            {
                if (i%j==0)break;
                if(j==i-1) System.out.println(i);
                }

            }
        }



    }