package com.company;

/**
 * Created by Ramel Henderson
 * on 11/1/2016.
 */
public class Husband {
    Husband husband;
    String firstname = "Someba";
    String lastname = "Williams";
    int yearborn;
    int wivesCount;

    private Husband(){}

    public Husband getInstance(){
        return husband;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearborn() {
        return yearborn;
    }

    public void setYearborn(int yearborn) {
        this.yearborn = yearborn;
    }

    public void getCountOfWives(){
        System.out.println(wivesCount);
    }

    public void setWife(Wife wife){
        System.out.println(wife.getFirstName() + " is " + firstname + "'s wife.");
        wivesCount++;
    }
}
