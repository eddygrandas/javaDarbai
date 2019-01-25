package com.company;

import org.omg.PortableInterceptor.ACTIVE;

import java.io.Console;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Menu(){
        init();
    }

    public void init(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskite varda");
        String name = scn.next();
        System.out.println("Iveskite slaptazodi");
        String password = scn.next();
        System.out.println("Iveskite emaila");
        String email = scn.next();
        System.out.println("Iveskite balansa");
        double balance = scn.nextDouble();
        System.out.println("Iveskite kredito limita");
        int creditLimit = scn.nextInt();

        Account acc = new Account(name, email, balance, creditLimit, password);
        try {
            new Database().addAccountToDb(acc);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}