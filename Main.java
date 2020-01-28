package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        PeopleUtility ceoMap = new PeopleUtility();

        Person elon = new Person("Elon",3334567);
        Person jeff = new Person("Jeff",4445678);
        Person bill = new Person("Bill",5556789);

        Map<String, Person> map = new HashMap<>();
        map.put("Musk", elon);
        map.put("Bezos", jeff);
        map.put("Gates", bill);

        System.out.println(ceoMap.prompt_for_last_name(map));
    }
}
