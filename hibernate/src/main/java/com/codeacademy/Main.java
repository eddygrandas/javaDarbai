package com.codeacademy;

import com.codeacademy.model.Person;
import com.codeacademy.model.Salary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] theory) {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Salary.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        Person person = new Person("Ponas", 45);
        session.save(person);
        Salary salary = new Salary(12345);
        salary.setId(person.getId());
        person.setSalary(salary);
        session.save(person);
        session.getTransaction().commit();

        System.out.println(salary.getId() + " - " + salary.getPay());

        session.disconnect();
    }

}