package com.company;

public class Person {

    private int id;
    private String name;
    private String pavarde;
    int receivedMoney;
    int sentMoney;


    public Person(int id, String name, String pavarde) {
        this.id = id;
        this.name = name;
        this.pavarde = pavarde;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pavarde='" + pavarde + '\'' +
                '}';
    }
}
