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
        lastName = prompt_for_last_name(listOfPeople);

        // use personList and last_name and
        // return the person (null if not found)
        List<Person> p = findPerson(listOfPeople, lastName);


        // If found print out the person
        if (p != null) {
            System.out.println(p);
            addNewPerson(listOfPeople);
            // print first, last, ssn
        }
    }


    public static String prompt_for_last_name(List<Person> listOfPeople) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bill Gates \n" + "Jeff Bezos\n" + "Elon Musk");
        System.out.print("Please enter the last name of a CEO to get their ID information: ");
        String inputName = input.next();
        Person p2 = new Person();

        do for (Person p : listOfPeople) {
            for (ListIterator<Person> iter = listOfPeople.listIterator(); iter.hasNext(); ) {
                p = iter.next();
                if (inputName.equals(p.getLastName())) {
                    return inputName;
                } else
                    continue;
            }
            System.out.println("There is no person with that last name from the list, please check your spelling and try again.");
            inputName = input.next();

        }  while (!inputName.equals(p2.getLastName()));

        return inputName;
    }


    public static List<Person> findPerson(List<Person> ceoList, String lastName) {

        List<Person> list = new ArrayList<>();
        for (Person p : ceoList) {
            if (p.getLastName().equals(lastName)) {
                list.add(p);
                break;
            }
        }
        return list;
    }

    //Enhancements: 1) Allow someone to add a person to the list
    private static void addNewPerson(List<Person> listOfPeople) {
        Scanner input = new Scanner(System.in);

        System.out.print("Add a new person to the list by entering a first and last name as well as a 7-digit ID number.\n");
        String newFirstName = input.next();
        String newLastName = input.next();
        int newID = input.nextInt();

        listOfPeople.add(new Person(newFirstName, newLastName, newID));
        System.out.println(listOfPeople);
        System.out.printf(newFirstName + " " + newLastName + " has been added to the list!");
    }
}