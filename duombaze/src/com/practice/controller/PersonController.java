package com.practice.controller;

import com.practice.controller.service.DatabaseService;
import com.practice.controller.service.FileReaderService;
import com.practice.model.Person;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
public class PersonController {
    private static final String CSV_REGEX = ",";
    private final List<Person> model;

    public void processPerson(String personFileDir, String phoneNumberFileDir) {
        readPerson(personFileDir);
        savePersons();
        /*Map<String, String> phoneNumbers = readPhoneNumbers(phoneNumberFileDir);
        setPhoneNumbersForPersons(phoneNumbers);
        savePhoneNumber();*/
    }

    private void savePhoneNumber() {
        DatabaseService databaseService = new DatabaseService();
        databaseService.savePhoneNumbers(filterEmptyPhoneNumbers(model));
        databaseService.closeConnection();
    }

    private List<Person> filterEmptyPhoneNumbers(List<Person> persons) {
        return model.stream()
                .filter(person -> person.getPhoneNumber() != null)
                .collect(Collectors.toList());
    }

    private void setPhoneNumbersForPersons(Map<String, String> phoneNumbers) {
        phoneNumbers.keySet()
                .forEach(name -> setPhoneNumberForPersonByName(name, phoneNumbers.get(name)));
    }

    private void setPhoneNumberForPersonByName(String name, String phoneNumber) {
        model.stream()
                .filter(person -> person.getName().equals(name))
                .findFirst()
                .ifPresent(person -> person.setPhoneNumber(phoneNumber));
    }

    private void readPerson(String personFileDir) {
        List<String> personLines = FileReaderService
                .readFile(personFileDir);
        for (String line : personLines) {
            String[] splitLine = line.split(CSV_REGEX);
            model.add(new Person(splitLine[0], Integer.valueOf(splitLine[1])));
        }
    }

    private Map<String, String> readPhoneNumbers(String phoneFileDir) {
        Map<String, String> phoneNumbers = new HashMap<>();
        List<String> phoneNumberLines = FileReaderService
                .readFile(phoneFileDir);
        for (String line : phoneNumberLines) {
            String[] splitLine = line.split(CSV_REGEX);
            phoneNumbers.put(splitLine[1], splitLine[0]);
        }
        return phoneNumbers;
    }

    private void savePersons() {
        if (!model.isEmpty()) {
            DatabaseService databaseService = new DatabaseService();
            databaseService.save(model);
            databaseService.closeConnection();
        } else {
            throw new RuntimeException("No model found");
        }
    }

    private void deleteAllOtherPeopleById(int idOfPersonNotToDelete){
        if(!model.isEmpty()){
            DatabaseService databaseService = new DatabaseService();
            databaseService.deleteAllOtherPersonsById(idOfPersonNotToDelete);
            databaseService.closeConnection();
        } else {
            throw new RuntimeException("No model found");
        }
    }

    private int updatePersonAgeToDouble() {
        Person personIdWithMaxAge = model.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElseThrow(RuntimeException::new);
        DatabaseService databaseService = new DatabaseService();
        databaseService.updatePerson(personIdWithMaxAge.getId(), personIdWithMaxAge.getAge() * 2);
        databaseService.closeConnection();

        return personIdWithMaxAge.getId();
    }


}