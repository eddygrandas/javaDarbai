package com.company;

public abstract class LegalPerson extends Person implements Employer{

    public Gender getGender(){
       throw new UnsupportedOperationException("Malunsparnis");
   }
}
