package com.practice;

import com.practice.controller.PersonController;

import java.util.ArrayList;

public class Main {

    public static void main (String[]theory){
        PersonController personController = new PersonController(new ArrayList<>());
        personController.processPerson("E:\\java\\code_academy_task1-master\\src\\main\\resources\\persons.csv", "E:\\java\\code_academy_task1-master\\src\\main\\resources\\phone_num.csv");
    }

}
