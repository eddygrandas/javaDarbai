package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array={2,34,65,70};
        System.out.format("%.2f",vidurkis(array));
    }

    public static double vidurkis(int[] array){
        int suma=0;
        for (int i=0; i<array.length; i++){
            suma+=array[i];
        }
        System.out.println(suma);
        System.out.println(array.length);
        double average = (double)suma/array.length;
        //System.out.format("%.4f",suma/array.length);
        return average;
    }
}
