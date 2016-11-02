package com.company;

/**
 * Created by Ramel Henderson
 * on 11/1/2016.
 */
public class Husband {
    static Husband  husband = new Husband();
    String firstname = "Someba";
    int lastname = 0;
    int yearborn;
    int wivesCount;

    private Husband(){}

    public static Husband getInstance(){
        return husband;
    }

    public String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public int getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = 0;
    }

    public int getYearborn() {
        return yearborn;
    }

    public void setYearborn(int yearborn) {
        this.yearborn = yearborn;
    }

    public int getCountOfWives(){
        return wivesCount;
    }

    public void setWife(Wife wife){

        wivesCount++;
    }
}
