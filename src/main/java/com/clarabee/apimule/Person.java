package com.clarabee.apimule;

import java.util.Calendar;

/**
 * Created by claraburgos on 11/15/16.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearBorn;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Year of Birth: " + yearBorn);



    }

    public void showAge(int yearBorn){
        System.out.println(Calendar.getInstance().get(Calendar.YEAR) - yearBorn);
    }

}
