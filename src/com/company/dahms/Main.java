package com.company.dahms;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Everything the internet shows indicates that a "collection class" is just an array list, so that's what I'm doing.
        ArrayList<Contact> contactBook = new ArrayList();

        Contact contact1 = new Contact("Gabe Newell", "hl3@valve.com");
        Contact contact2 = new Contact("Todd Howard", "itjustworks@bethesda.com");

        contactBook.add(contact1);
        contactBook.add(contact2);
        
        for (Contact contacts : contactBook) {
            System.out.println(contacts.toString());
        }

    }

}
