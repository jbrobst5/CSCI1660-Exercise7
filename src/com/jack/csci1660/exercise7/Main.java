package com.jack.csci1660.exercise7;

/*
Write a program that includes a class representing contact information for a person including their name and email
address. This class should include a method for displaying the contact's name and email address. The program should
also include a class for business contacts that extends the contact class and stores the contact's phone number. The
business contact class should override the base class's method that displays the name and email address so that it
displays the phone number in addition to the name and email address. Create instances of both classes to demonstrate
functionality.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Contact> contacts = new ArrayList<>();
        String[] options = {
                "Show all contacts",
                "Create a contact",
                "Exit"
        };

        boolean running = true;
        while (running) {
            System.out.println("Please select an option:");
            for (int i = 0; i < options.length; i++){
                System.out.printf("\t%d: %s\n", i, options[i]);
            }
            String typed = scanner.nextLine();
            int selection = Integer.parseInt(typed);
            if (selection == 0) {
                showAllContacts(contacts);
            }
            else if (selection == 1) {
                createNewContact(scanner, contacts);
            }
            else if (selection == 2) {
                running = false;
            }
        }
        System.out.println("Closing");
    }

    private static void showAllContacts(ArrayList<Contact> contacts) {
        for (Contact c: contacts) {
            c.displayContact();
        }
    }

    private static void createNewContact(Scanner scanner, ArrayList<Contact> contacts) {
        System.out.println("Type 1 for Contact\nType 2 for BusinessContact");
        String typed = scanner.nextLine();
        int selection = Integer.parseInt(typed);

        System.out.println("Type the contact's name:");
        String name = scanner.nextLine();

        System.out.println("Type the contact's email:");
        String email = scanner.nextLine();

        if (selection == 1) {
            contacts.add(new Contact(name, email));
            System.out.println("Contact added");
        }
        else if (selection == 2) {
            System.out.println("Type the contact's phone: ");
            String phone = scanner.nextLine();
            contacts.add(new BusinessContact(name, email, phone));
            System.out.println("Contact added");
        }
    }
}
