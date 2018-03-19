package com.jack.csci1660.exercise7;

/**
 * Created by brobst.30 on 3/19/18.
 */
public class Contact {

    String name;
    String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayContact() {
        System.out.printf("---------------\n|  Name: %s  |\n|  Email: %s  |\n---------------\n", this.name, this.email);
    }
}