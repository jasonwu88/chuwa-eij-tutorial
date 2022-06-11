package com.chuwa.tutorial.oop.abstractclass_interface;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author b1go
 * @date 5/10/22 3:09 PM
 */
public abstract class Person {
    private String name;
    private String phoneNumber;

    // abstract class have constructors
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract boolean signUp();

    public void walk() {
        System.out.println("People Walk");
    }

    public void meeting() {
        System.out.println("People meeting");
    }
}
