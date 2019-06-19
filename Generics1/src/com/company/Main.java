package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {

    public static void main(String[] args) {

        Integer[] integerList = {1, 2, 3};
        String[] stringList = {"Hello", "world"};
        printArray(integerList);
        printArray(stringList);

    }
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray)
            System.out.println(element);
    }

}


