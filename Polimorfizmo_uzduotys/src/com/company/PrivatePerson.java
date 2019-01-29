package com.company;

abstract class PrivatePerson extends Person{
    public PrivatePerson() {
    }

    public PrivatePerson(Long personalID, String name, Gender gender) {

    }

    public static Person personOfType(String type, Long personalID, String name, Gender gender) {
        if ("employed".equals(type)) {
            return new EmployedPerson(personalID, name, gender);
        } else {
            return new UnemployedPerson(personalID, name, gender);
        }
    }
}
