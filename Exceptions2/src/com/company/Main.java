package com.company;

import java.util.InputMismatchException;

public class Main extends Input {

    public static void main(String[] args) {
        // write your code here
        Input input = new Input();
        while (true) {
            try {
                //input.getIvesti();
                System.out.println(input.getIvesti());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ivestas netinkamas skaicius");


            }

        }
    }
}