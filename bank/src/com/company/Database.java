package com.company;

import java.security.AccessControlContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");


    Database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/bank_system","root","duombaze");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Item getItem(String pid) throws SQLException {
        statement = connection.createStatement();
        String query = "SELECT * FROM items Where productId = '"+pid+"';";
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            String productId = resultSet.getString("productId");
            double price = resultSet.getDouble("price");
            int quantity = resultSet.getInt("quantity");
            String title = resultSet.getString("title");
            String description = resultSet.getString("description");

            return new Item(productId, price, quantity, title, description);
        }
        return null;
    }

    public Account getAccount(String acn) throws SQLException {
        statement = connection.createStatement();
        String query = "SELECT * FROM accounts Where accountNumber = '"+acn+"';";
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            double balance = resultSet.getDouble("balance");
            String accountNumber = resultSet.getString("accountNumber");
            int credit = resultSet.getInt("credit");

            return new Account(name, email, accountNumber, balance, credit);
        }
        return null;
    }

    public List <Transaction> getTransactions(int sid) throws SQLException {
        List<Transaction> transactions = new ArrayList<>();
        statement = connection.createStatement();
        String query = "SELECT * FROM transactions Where senderId = '"+sid+"';";
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            double amount = resultSet.getDouble("amount");
            String date  = resultSet.getString("date");
            int senderId = resultSet.getInt("senderId");
            int recieverId = resultSet.getInt("recieverId");
            String currency = resultSet.getString("currency");
            transactions.add(new Transaction(senderId,recieverId,amount,currency,date));
        }
        return transactions;
    }

    public Account getAccountById(int rid) throws SQLException {
        statement = connection.createStatement();
        String query = "SELECT * FROM accounts WHERE id = "+rid;
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){

            return new Account(resultSet.getString("name"), resultSet.getString("email"), resultSet.getString("passwordHash"), resultSet.getDouble("balance"),resultSet.getString("accountNumber"),
                    resultSet.getInt("credit"));
        }
        return null;
    }

    public void addAccountToDb(Account acc) throws SQLException {
        statement = connection.createStatement();
        String name = acc.getName();
        String email = acc.getEmail();
        String passwordHash = acc.getPasswordHash();
        double balance = acc.getBalance();
        String accountNumber = acc.getAccountNumber();
        int crediLimit = acc.getCreditLimit();
        String query = String.format("INSERT into accounts values(NULL, '%s', '%s', '%s', %.2f, '%s' , %d);",name, email, passwordHash, balance, accountNumber, crediLimit);
        //System.out.println(query);
        statement.execute(query);

    }

}