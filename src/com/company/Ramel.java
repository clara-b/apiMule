package com.company;

/**
 * Created by Ramel Henderson
 * on 11/1/2016.
 */
public class Ramel {
    String name ="Ramel Henderson";
    String occupation = "Programmer";

    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String newOccupation){
        occupation = newOccupation;
    }

    int yearBorn = 1085;

    public String getName(){
        return name;
    }

    public void sayHello (String name){
        System.out.println("Hello " + name);
    }

    public void loveHate(String name){
        System.out.println("I loveHate " + name);
    }
}
