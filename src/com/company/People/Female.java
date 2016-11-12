package com.company.People;

import com.company.Abstracts.Person;
import com.company.Sex;

/**
 * Created by Ramel Henderson
 * on 11/11/2016.
 */
public class Female extends Person implements Sex{
    public Female(String firstName, String lastName, int age, String ethnicity) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAge(age);
        super.setEthnicity(ethnicity);
        super.setSex("Female");
    }


    public void poot() {
        System.out.println(getFirstName() + " pooted... Cute.");
    }

    @Override
    public void showGenetials() {
        System.out.println(getFirstName() + " showed her box!");
    }

    @Override
    public void haveSex(Person person) {
        System.out.println(this.getFirstName() + " took " + person.getFirstName() + "'s dick!");
    }
}
