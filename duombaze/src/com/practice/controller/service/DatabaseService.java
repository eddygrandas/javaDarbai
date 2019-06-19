package com.practice.controller.service;

import com.practice.model.Person;

import java.sql.*;
import java.util.List;

public class DatabaseService {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/playground?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    //usually you find these in config files
    private static final String USERNAME = "medardas";
    private static final String PASSWORD = "pass";
    private static final String INSERT_PERSON = "INSERT INTO person (name, age) VALUES(?, ?)";
    private static final String INSERT_PHONE_NUMBER = "INSERT INTO phone_number (number,person_id) VALUES(?, ?)";
    private static final String UPDATE_PERSON_AGE = "UPDATE person SET age=? WHERE id=?";
    private static final String DELETE_ALL_OTHER_PERSON_BY_ID = "DELETE FROM person WHERE id<>?";

    Connection connection;

    public DatabaseService() {
        try {
            this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();   //proper handling is not the objective right now
        }
    }

    public void savePhoneNumbers(List<Person> persons) {
        for (Person person : persons) {
            savePhoneNumber(person);
        }
    }

    private void savePhoneNumber(Person person) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PHONE_NUMBER);
            preparedStatement.setString(1, person.getPhoneNumber());
            preparedStatement.setInt(2, person.getId());
            int executionResult = preparedStatement.executeUpdate();
            if (executionResult == 0)
                throw new SQLException("Could not add phone number for Person ID" + person.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            int personId = save(persons.get(i));
            persons.get(i).setId(personId);
        }
    }

    public void updatePerson(int personIdToUpdate, int age) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PERSON_AGE);
            preparedStatement.setInt(1, age);
            preparedStatement.setInt(2, personIdToUpdate);
            int executionResult = preparedStatement.executeUpdate();
            if (executionResult == 0)
                throw new SQLException("Could not update with personId: " + personIdToUpdate);
        } catch (SQLException e) {
            e.printStackTrace(); //nerupi
        }
    }

    public void deleteAllOtherPersonsById(int personIdToNotDelete) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ALL_OTHER_PERSON_BY_ID);
            preparedStatement.setInt(1, personIdToNotDelete);
            int executionResult = preparedStatement.executeUpdate();
            if (executionResult == 0)
                throw new SQLException("Could not delete person whos ID is not: " + personIdToNotDelete);
        } catch (SQLException e) {
            e.printStackTrace(); //nerupi
        }
    }

    private int save(Person person) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, person.getName());
            preparedStatement.setInt(2, person.getAge());
            int executionResult = preparedStatement.executeUpdate();
            if (executionResult == 0)
                throw new SQLException("Could not insert: " + person.getName());
            ResultSet generatedIds = preparedStatement.getGeneratedKeys();
            if (generatedIds.next())
                return generatedIds.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace(); //proper handling is not the objective right now
        }
        return -1;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();    //proper handling is not the objective right now
        }
    }
}