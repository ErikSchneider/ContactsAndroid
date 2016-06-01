package com.theironyard.contactsandroid;

/**
 * Created by Erik on 6/1/16.
 */
public class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " " + "(" + " " + phone + " " + ")";

    }
}


