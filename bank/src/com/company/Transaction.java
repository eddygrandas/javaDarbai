package com.company;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private Account receiver;
    private Account sender;
    private double amount;
    private String currency;
    private String date;


    public Transaction(int sid, int rid, double amount, String currency, String date) throws SQLException {
        this.receiver = new Database().getAccountById(rid);
        this.sender = new Database().getAccountById(sid);
        this.amount = amount;
        this.currency = currency;
        this.date = date;
    }

    public Transaction(double amount, String currency, String  date) {
        this.amount = amount;
        this.currency = currency;
        this.date = date;

    }

    Transaction(Account s, Account r, double a){
        this.sender = s;
        this.receiver = r;
        this.amount = a;
    }

    public void makeTransaction() {
        if (this.sender.getBalance() >= this.amount) {
            this.sender.setBalance(this.sender.getBalance() - this.amount);
            this.receiver.setBalance(this.receiver.getBalance() + this.amount);
            printTransaction();
        }
    }

    public void printTransaction(){
        System.out.println("Pavedimas is "+this.sender.getName() +" i "+ this.receiver.getName()+" saskaita:");
        System.out.println("Suma: "+this.amount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "receiver=" + receiver + "\n"+
                ", sender=" + sender + "\n"+
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}