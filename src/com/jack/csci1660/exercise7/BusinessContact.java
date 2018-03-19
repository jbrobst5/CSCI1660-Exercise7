package com.jack.csci1660.exercise7;

/**
 * Created by brobst.30 on 3/19/18.
 */
public class BusinessContact extends Contact {

    String phone;

    public BusinessContact(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    @Override
    public void displayContact() {
        System.out.printf("---------------\n|  Name: %s  |\n|  Email: %s  |\n|  Phone: %s\n---------------\n",
                this.name, this.email, this.phone);
    }
}
