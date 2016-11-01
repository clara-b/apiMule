package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Ramel ramel = new Ramel();
        Clara clara = new Clara();

        ramel.sayHello(clara.getName());

        ramel.loveHate("Jesus");

        System.out.println(clara.findAge(ramel.yearBorn));


        if(clara.getRace().equals("Puerto Rican")){
            ramel.setOccupation("Janitor");
        }

        clara.checkCompatibility(ramel.getOccupation());
    }




}
