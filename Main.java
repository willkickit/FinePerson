package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lastName;

        // Create List of People
        Person bill = new Person("Bill", "Gates", 3803932);
        Person jeff = new Person("Jeff", "Bezos", 3814333);
        Person elon = new Person("Elon", "Musk", 3819193);

        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(bill);
        listOfPeople.add(jeff);
        listOfPeople.add(elon);


        // Prompt user to get last name
        lastName = prompt_for_last_name();

        // use personList and last_name and
        // return the person (null if not found)
        List<Person> p = findPerson(listOfPeople, lastName);

        // If found print out the person
        if (p != null) {
            System.out.println(p);
            // print first, last, ssn
        } else
            // print There is no person with that last name
            System.out.println("There is no person with that last name.");
    }

    public static String prompt_for_last_name() {

        Scanner input = new Scanner(System.in);
        System.out.println("Bill Gates \n" + "Jeff Bezos\n" + "Elon Musk");
        System.out.print("Please enter the last name of a CEO to get their ID information: ");
        String inputName = input.next();
        return inputName;
    }

    public static List<Person> findPerson(List<Person> ceoList, String lastName) {
        List<Person> list = new ArrayList<>();
        for (Person p : ceoList) {
            if (p.getLastName().equals(lastName)) {
                list.add(p);
            }
        }
        return list;
    }
}
