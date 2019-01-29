package com.company;

abstract class Person{
    private Long personalID;
    private String name;
    private Gender gender;

    public Long getPersonalID() {
        return personalID;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Person(Long personalID, String name, Gender gender) {
        this.personalID = personalID;
        this.name = name;
        this.gender = gender;
    }

    public Person() {
    }
}
