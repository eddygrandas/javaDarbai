package com.company;

public class Main extends C{

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        try {
            divide(x, y);
            //System.out.println(divide(x, y));
        }catch (ArithmeticException e){
            System.out.println("Ismok skaiciuot, dalyba is nulio negalima");
        }
        }
    }

class B extends C{
   int sum(int x, int y){
       //System.out.println(x+y);
       return x+y;
   }
}
abstract class C{
    static double divide(int x, int y){
    B b= new B();
       // System.out.println(b.sum(5,7)/y);
    return b.sum(5,7)/y;
    }
}