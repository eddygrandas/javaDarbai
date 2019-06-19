package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import  java.lang.String;

public class Konv {


    public void Veik(List<Integer> sarasas){

    String naujas = sarasas.stream()
            .map(skaicius -> (skaicius % 2 == 0? skaicius + "e": skaicius + "o"))
            .collect(Collectors.joining(","));
            System.out.println("Padirbeta: "+ naujas);
    }





}

