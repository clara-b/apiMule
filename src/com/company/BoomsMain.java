package com.company;

import com.company.People.Female;
import com.company.People.Male;

/**
 * Created by Ramel Henderson
 * on 11/11/2016.
 */
public class BoomsMain {

    public static void main(String[] args){
        Male bobby = new Male("Robert","Chadskin", 31, "Black");
        Female wendy = new Female("Wendy", "Winans", 26, "White");
        wendy.poot();
        bobby.fart();
        System.out.println(wendy.getFirstName() + "\n" + bobby.getFirstName());

        bobby.haveSex(wendy);
        wendy.haveSex(bobby);

    }
}
