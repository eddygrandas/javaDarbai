package com.company;

import com.sun.prism.PixelFormat;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;

public class Account {
    private String passwordHash;
    private String name;
    private String email;
    private String accountNumber;
    private double balance;
    private boolean isCreditable;
    private int creditLimit;
    private List<Item> items;

    public void removeItem(Item i){
        this.items.remove(i);
    }

    public Item getItem(String productId){
        for(int i = 0; i < items.size();i++){
            Item item = items.get(i);
            if(productId.equals(item.getProductId())){
                return item;
            }
        }
        System.out.println("Produktas nebuvo rastas");
        return null;
    }

    public void addItem(Item item){
        items.add(item);
    }

    Account(String name, String email, String passwordHash, double balance, String accountNumber, int credit){
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.balance = balance;
        this.accountNumber =accountNumber;
        this.creditLimit = credit;
        if (creditLimit > 0) this.isCreditable = true;
        else this.isCreditable = false;
    }

    Account(String n, String e){
        this.name = n;
        this.email = e;
        this.balance = 0;
        this.isCreditable = false;
        this.creditLimit = 0;
        this.accountNumber = generateNumber();
        items = null;
    }

    Account(String n, String e, double b){
        this.name = n;
        this.email = e;
        this.balance = b;
        this.isCreditable = false;
        this.creditLimit = 0;
        this.accountNumber = generateNumber();
        items = null;
    }

    Account(String n, String e, double b, int cl, String password){
        this.name = n;
        this.email = e;
        this.balance = b;
        this.isCreditable = true;
        this.creditLimit = cl;
        this.accountNumber = generateNumber();
        items = null;
        this.passwordHash = hashPassword(password);
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            String hashPassword = DatatypeConverter.printHexBinary(digest);
            return hashPassword;

        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getCause());
        }
        return null;
    }

    public Account(String name, String email, String accountNumber, double balance, int creditLimit) {
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", isCreditable=" + isCreditable +
                ", creditLimit=" + creditLimit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isCreditable() {
        return isCreditable;
    }

    public void setCreditable(boolean creditable) {
        isCreditable = creditable;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    private String generateNumber(){
        Random rnd = new Random();
        String result = "LT";
        for(int i = 0; i < 18; i++){
            result += String.valueOf(rnd.nextInt(9));
        }
        return result;
    }
}