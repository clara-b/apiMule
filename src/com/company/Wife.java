package com.company;

/**
 * Created by claraburgos on 11/1/16.
 */
public  class Wife {

    String firstName;
    String maidenName;
    String lastName;
    int yearBorn;
    Husband myHusband;



    public void setMyHusband(Husband newHusband){
        myHusband = newHusband;
        lastName = myHusband.getLastname();
    }
    public Husband getHusband(){
        return myHusband;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearBorn() {
        return yearBorn;

    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public void setMaidenName(String newMaidenName){
        maidenName = newMaidenName;
    }

    public void setYearBorn(int newYearBorn){
        yearBorn = newYearBorn;
    }

}
