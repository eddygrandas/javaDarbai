package com.company;

import com.sun.org.apache.bcel.internal.classfile.LineNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main extends Person {

    public Main(int id, String name, String pavarde) {
        super(id, name, pavarde);
    }

    public static void main(String[] args) throws IOException {

        Map<Integer, Person> people = new HashMap<>();
        Path peopleFile = Paths.get("E:\\java\\Files\\src\\com\\company\\person");
        List<String> lines = Files.readAllLines(peopleFile);
        for (String line: lines){
            String[] strings=line.split(",");
            Person person = new Person(Integer.parseInt(strings[0]), strings[1].trim(), strings[2].trim());

            System.out.println(person);
            people.put(person.getId(), person);
        }
    }
}




        //Person person = new Person();
        //String id;
//        Scanner sc = null;
//        try {
//            sc = new Scanner(new File("E:\\java\\Files\\src\\com\\company\\person"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        // sc.nextLine();
//        sc.useDelimiter("\\s*, \\s*|\\n");
//        sc.nextLine();
//        while (sc.hasNext()) {
//            person.id = (sc.nextInt());
//            person.name = (sc.next());
//            person.pavarde = (sc.next());

            //System.out.println(person.id + person.name + person.pavarde);


        //}
        //sc.close();
//    }
//
//}