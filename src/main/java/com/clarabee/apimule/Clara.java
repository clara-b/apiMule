package com.clarabee.apimule;

/**
 * Created by claraburgos on 11/21/16.
 */
public class Clara extends Female implements Student {
    public Clara(int yearBorn, String firstName, String lastName) {
        super(yearBorn, firstName, lastName);
    }

    public void Study(int hours) {
        System.out.println(getFirstName() + " studied for " + hours + " hours!");

    }
}
