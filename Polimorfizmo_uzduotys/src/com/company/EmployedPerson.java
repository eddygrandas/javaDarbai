package com.company;

public class EmployedPerson extends PrivatePerson implements Employee{
    public EmployedPerson(Long personalID, String name, Gender gender) {
        super(personalID,name, gender);
    }
    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public String getEmployerName() {
        return null;
    }
}
