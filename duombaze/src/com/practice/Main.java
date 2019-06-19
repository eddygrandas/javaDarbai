package com.practice;

import com.practice.controller.PersonController;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PersonController personController = new PersonController(new ArrayList<>());
        personController.processPerson("persons.csv", "phone_num.csv");
    }
}
