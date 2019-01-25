package com.company;

public class Main {


        public static void main(String[] args) {
            String eilute1 = "tekstas";
            String eilute2 = new String("tekstas");
            eilute1.toUpperCase();

            System.out.println(eilute1); // tekstas
            StringBuilder sb = new StringBuilder("tekstas");
            sb.reverse();
            System.out.println(sb); // satsket
        }
    }

