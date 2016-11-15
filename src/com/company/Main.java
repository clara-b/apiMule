package com.company;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Ramel ramel = new Ramel();
        Clara clara = new Clara();
//
//        ramel.sayHello(clara.getName());
//
//        ramel.loveHate("Jesus");
//
//        System.out.println(clara.findAge(ramel.yearBorn));
//
//
//        if (clara.getRace().equals("Puerto Rican")) {
//            ramel.setOccupation("Janitor");
//        }
//
//        clara.checkCompatibility(ramel.getOccupation());

        Husband guy = Husband.getInstance();
        Wife wife1 = new Wife();
        Wife wife2 = new Wife();

        wife1.setFirstName("Jody");
        wife1.setMaidenName("Jones");
        wife1.setYearBorn(1980);

        wife2.setFirstName("Lisa");
        wife2.setMaidenName("Green");
        wife2.setYearBorn(1992);

        wife1.setMyHusband(guy);
        wife2.setMyHusband(guy);

        System.out.println("First name: " + wife1.getFirstName()
                + "\n Maiden Name: " + wife1.getMaidenName()
                + "\n Last name: " + wife1.getLastName());

        System.out.println("First name: " + wife2.getFirstName()
                + "\n Maiden Name: " + wife2.getMaidenName()
                + "\n Last name: " + wife2.getLastName());

        Wife wife3 = createWife("Amy", "Brown", 1992, guy);

        guy.setWife(wife3);
        guy.setWife(wife1);
        guy.setWife(wife2);

        System.out.println("This nigga has " + guy.getCountOfWives() + " wives!");
        printWifeInfo(wife3);

    }

    public static Wife createWife(String firstName, String maidenName, int yearBorn, Husband husband) {

        Wife newWife = new Wife();
        newWife.setFirstName(firstName);
        newWife.setMaidenName(maidenName);
        newWife.setYearBorn(yearBorn);
        newWife.setLastName(husband.getLastname());
        return newWife;

    }

    public static void printWifeInfo(Wife wife) {


        System.out.println("First name: " + wife.getFirstName()
                + "\n Maiden Name: " + wife.getMaidenName()
                + "\n Last name: " + wife.getLastName());
    }

}
