package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int getIvesti() throws InputMismatchException {
        Scanner ivesti = new Scanner(System.in);
        System.out.println("Ivesk sveikaji skaiciu.");
        return ivesti.nextInt();
    }
}
