package com.company;

import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> users = new ArrayList<Account>();

        users.add(new Account("Tomas", "tomas@abc.com", 1220));

        users.add(new Account("Marius", "marius@abc.com"));
        users.add(new Account("Jonas", "jonas@abc.com", 6001));
        users.add(new Account("Jonas2", "jonas2@aabc.com", 60));

        Transaction t = new Transaction(users.get(0), users.get(1),12.0);

        t.makeTransaction();

        Database db = new Database();

//        try {
//            Item i = db.getItem("33333");
//            System.out.println(i.toString());
//            System.out.println(db.getAccountById(2));
//            List <Transaction> transactions = db.getTransactions(5);
//            for(Transaction tr: transactions) System.out.println(tr.toString()+"\n");
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            Account a = db.getAccount("LT15654645");
//            System.out.println(a.toString());
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            Transaction tr = db.getTransaction("3");
//            System.out.println(tr.toString());
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }


        new Menu();
    }

}