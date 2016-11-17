package com.clarabee.apimule;

/**
 * Created by claraburgos on 11/16/16.
 */
public class Woman extends Person {

    Woman(int yearBorn, String firstName, String lastName){
        super.setYearBorn(yearBorn);
        super.setGender("Female");
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }

}
