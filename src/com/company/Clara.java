package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by claraburgos on 11/1/16.
 */
public class Clara {

    String name = "Clara";

    public String getName(){
        return name;

    }

    public void addForYou (int x, int y){
        System.out.println(x + y);

    }

    public int findAge(int birthYear){
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }
}
