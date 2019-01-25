package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 public static void Main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int []arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        List<Integer> result = solve(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

class Solution {

    private static List<Integer> solve(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
            } else if (diff == min) {
                list.add(arr[i]);
                list.add(arr[i + 1]);
            }
        }
        return list;
    }

}