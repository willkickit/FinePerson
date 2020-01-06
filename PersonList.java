package com.company;

import java.util.*;

public class PersonList extends Person {
    private List<Person> list;

    PersonList() {
        super();
        this.list = new ArrayList<>();
        Person p1 = new Person("Bill", "Gates", 83399232);
        Person p2 = new Person("Jeff", "Bezos", 230501234);
        Person p3 = new Person("Will", "Johnson", 18332043);
        Person p4 = new Person("David", "Gates", 53230382);
        Person p5 = new Person("Dwayne", "Johnson", 23848103);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
    }

    public void matchingLastName() {

        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println(list);
        System.out.print("Please enter a last name from the list above: ");
        String inputName = input.next();

        //Looping through each person in list
        for (Person p : list) {
            for (ListIterator<Person> iter = list.listIterator(); iter.hasNext(); ) {
                p = iter.next();

                if (inputName.equals(p.getLastName())) {
                    count++;
                    System.out.println(p);
                } else
                    continue;
            }

            //checking for matching and invalid entries
            if (count > 1) {
                System.out.println("There are " + count + " people with the last name " + inputName);
                break;
            } else if (count == 1) {
                System.out.println("There is " + count + " person with the last name " + inputName);
                break;

            } else if (inputName.equals(inputName.toUpperCase()) || inputName.equals(inputName.toLowerCase())) {
                System.out.println(" *Entries are case-sensitive* ");
                System.out.println("Invalid last name, please try again. ");
                inputName = input.next();

            } else if (!inputName.equals(p.getLastName())) {
                System.out.println("Invalid name, please try again.");
                inputName = input.next();
            }
        }
    }
}
