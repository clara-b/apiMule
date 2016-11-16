package com.clarabee.apimule;

/**
 * Created by claraburgos on 11/15/16.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearBorn;


    //getter for firstName
    public String getFirstName() {
        return firstName;
    }

    //setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter for lastName
    public String getLastName(){ return lastName; }

    //setter for lastName
    public void setLastName(String lastName) { this.lastName = lastName; }

    //getter for gender
    public String getGender() { return gender; }

    //setter for gender
    public void setGender(String gender) { this.gender = gender; }

    //getter for yearBorn
    public int getYearBorn(){ return yearBorn; }

    //setter for yearBorn
    public void setYearBorn(int yearBorn) { this.yearBorn = yearBorn; }

    public void printsInfo(){
        System.out.println("Name: " + firstName + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Year of Birth : " + yearBorn;

    }


}
