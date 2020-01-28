package com.company;

import java.util.Map;
import java.util.Scanner;

public class PeopleUtility extends Person
{


    /* Now we are going to do the same thing but use a Dictionary instead of a list of people.
   The 'keys' will be the last names, and the values will be the first name + SSN.
   prompt user to enter a last name.
   Print the 'value' if the entered last name matches one of the 'keys'. */

    public Person prompt_for_last_name(Map<String, Person> map){
        Scanner input = new Scanner(System.in);
        System.out.println("Bill Gates \n" + "Jeff Bezos\n" + "Elon Musk");
        System.out.print("Please enter the last name of a CEO to get their ID information: ");
        String inputName = input.next();

        for(Map.Entry<String, Person> entry : map.entrySet()) {
            if(inputName.equals(entry.getKey())){
                return entry.getValue();
            }
        }
        return null;
    }

}
