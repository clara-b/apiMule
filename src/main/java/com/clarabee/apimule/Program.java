package com.clarabee.apimule;



/**
 * Created by Ramel Henderson
 * on 11/15/2016.
 */
public class Program {

    static Super aSuper = new Super();
    static Sub aSub = new Sub();
    static SubSub aSubSub = new SubSub();
    static Female female = new Female(1989, "Clara", "Bee");
    static Male male = new Male(1985);
    static Clara clara = new Clara(1989, "Clara", "Bee");


    public static void main(String[] args) {
        aSuper.a();

        aSub.a();
        aSub.b();

        aSubSub.a();
        aSubSub.b();
        aSubSub.c();

        male.showAge(male.getYearBorn());
        male.urinateStandingUp();

        female.showAge(female.getYearBorn());
        female.havePeriod();

        aSuper.sayHello();
        aSub.sayHello();
        aSubSub.sayHello();
        female.scream();
        male.scream();

        clara.Study(20);

    }


}
