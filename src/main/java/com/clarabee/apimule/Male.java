package com.clarabee.apimule;

/**
 * Created by claraburgos on 11/21/16.
 */
public class Male extends Person {

    Male (int yearBorn){
        super.setYearBorn(yearBorn);
    }

    public void urinateStandingUp(){

    }

    @Override
    public void scream() {
        System.out.println("Ahhhh!");
    }
}
