package com.company.People;

import com.company.Abstracts.Person;
import com.company.Sex;

/**
 * Created by Ramel Henderson
 * on 11/11/2016.
 */
public class Male extends Person implements Sex{


    public Male(String firstName, String lastName, int age, String ethnicity) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAge(age);
        super.setEthnicity(ethnicity);
        super.setSex("Male");
    }

    public void fart() {
        System.out.println(getFirstName() + " just farted.... Gross");
    }

    @Override
    public void showGenetials() {
        System.out.println(this.getFirstName() + " showed his penis!");
    }

    @Override
    public void haveSex(Person person) {
        System.out.println(this.getFirstName() + " put his penis in " + person.getFirstName() + "'s box!");
    }
}
