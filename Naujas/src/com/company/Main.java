package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello wold");
        int a = 0;
        System.out.println("Iveskite skaiciu nuo 1 iki 12");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a > 0 && a < 13) {
            if (a > 0) {
                if (a < 13) {
                    if (a % 2 == 0) {
                        String menuo = "belenkas";
                        switch (a) {
                            case 2:
                                menuo = "Vasaris";
                                System.out.println(menuo);
                                break;
                            case 4:
                                menuo = "Balandis";
                                System.out.println(menuo);
                                break;

                            case 6:
                                menuo = "Birzelis";
                                System.out.println(menuo);
                                break;

                            case 8:
                                menuo = "Rugpjutis";
                                System.out.println(menuo);
                                break;

                            case 10:
                                menuo = "Spalis";
                                System.out.println(menuo);
                                break;


                            case 12:
                                menuo = "Gruodis";
                                System.out.println(menuo);
                                break;

                        }

                    } else {
                        String menuo = "belenkas";
                        switch (a) {
                            case 1:
                                menuo = "sausis";
                                System.out.println(menuo);
                                break;


                            case 3:
                                menuo = "kovas";
                                System.out.println(menuo);
                                break;


                            case 5:
                                menuo = "geguze";
                                System.out.println(menuo);
                                break;


                            case 7:
                                menuo = "liepa";
                                System.out.println(menuo);
                                break;


                            case 9:
                                menuo = "rugsejis";
                                System.out.println(menuo);
                                break;


                            case 11:
                                menuo = "lapkritis";
                                System.out.println(menuo);
                                break;

                        }
                    }
                } else {
                    System.out.println("netinkamas skaicius");
                }
            } else {
                System.out.println("netinkamas skaicius");
            }
        } else {
            System.out.println("Iveskite teisinga skaiciu");
        }

    }
}
