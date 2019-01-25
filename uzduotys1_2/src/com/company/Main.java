package com.company;

import java.lang.reflect.Array;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] arr = new String[10];

        Scanner vardas = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = vardas.next();
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j].toUpperCase() + "-" + arr[j].length() + "-" + j);
        }
    }
}