package com.company;

public class Transaction {
    private Account receiver;
    private Account sender;
    private double amount;

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
        return "Tranasction{" +
                "receiver=" + receiver +
                ", sender=" + sender +
                ", amount=" + amount +
                '}';
    }
}
