package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by claraburgos on 11/1/16.
 */
public class Clara {

    String name = "Clara";
    String race = "Puerto Rican";
    public String getRace(){
        return race;
    }

    public String getName(){
        return name;

    }

    public void addForYou (int x, int y){
        System.out.println(x + y);

    }

    public int findAge(int birthYear){
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }


    public void checkCompatibility(String occupation){

        if (occupation.equals("Programmer")){

            System.out.println("Let's go out!");
        } else {

            System.out.println("Sorry, not interested.");
        }



    }
}
