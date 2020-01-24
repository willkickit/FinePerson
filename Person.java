package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int id;

    public Person() { }

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    String getLastName() {
        return lastName;
    }

    //returning person's full name and id
        public String toString() {
            return this.firstName + " " +
                    this.lastName + ": " +
                    this.id;
        }

}