package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public Person() { }

    public Person(String firstName, String lastName, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    String getLastName() {
        return lastName;
    }

    //returning person's full name and ssn
        public String toString() {
            return this.firstName + " " +
                    this.lastName + ": " +
                    this.socialSecurityNumber;
        }

}