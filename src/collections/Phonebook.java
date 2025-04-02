package collections;

import java.util.*;

public class Phonebook {

    // Phone book having some contacts store name and phone number
    // When i moved data to new phone some contacts are missing

    // problem statement is how to find what is missed

    public static void main(String[] args) {

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Pradeep", "11223344"));
        contactList.add(new Contact("Pradeep", "11223345"));
        contactList.add(new Contact("Kenny", "334455"));
        contactList.add(new Contact("Jhon", "667788"));

        List<Contact> newPhoneBook = new ArrayList<>();
        newPhoneBook.add(new Contact("Pradeep", "11223344"));
        newPhoneBook.add(new Contact("Pradeep", "11223345"));
        newPhoneBook.add(new Contact("Kenny", "334455"));


        Map<String, String> oldPhone = new HashMap<>();
        oldPhone.put("Pradeep", "11223344");
       // oldPhone.put("Pradeep", "11223345");
        oldPhone.put("Kenny", "334455");
        oldPhone.put("Jhon", "667788");

        Map<String, String> newPhone = new HashMap<>();
        newPhone.put("Pradeep", "11223344");
        //oldPhone.put("Pradeep", "11223345");
        newPhone.put("Kenny", "334455");

        for (String key: oldPhone.keySet()){
            if(!oldPhone.get(key).equalsIgnoreCase(newPhone.get(key))){
                System.out.println("Missing = "+key);
            }
        }
    }
}
