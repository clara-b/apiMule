package com.clarabee.apimule.ObjectOrientedPractice;

/**
 * Created by Ramel Henderson
 * on 11/23/2016.
 */



    /*----------------------------Class Start----------------------------*/

    // step 0
    class Prototype extends EncapsulationDemo implements PolyMorphismDemo.Vegetarian, InterfaceDemo.Wizardry {

    // step 1
    int wizardNumber;
    String wizardName;

    public int getWizardNumber(){
        return wizardNumber;
    }

    public int setWizardNumber(int newWizardNumber){
        wizardNumber = newWizardNumber;
        return newWizardNumber;
    }

    public String getWizardName(){
        return wizardName;
    }

    public String setWizardName(String newWizardName){
        wizardName = newWizardName;
        return newWizardName;
    }

    // step 6
    Prototype( String firstname, String lastname, int userId, int wizardNumber, String wizardName){
        super.setFirstname(firstname);
        super.setLastname(lastname);
        super.setUserId(userId);
        setWizardName(wizardName);
        setWizardNumber(wizardNumber);

    }

    // step 2
    public void castSpell() {
       System.out.println("I cast a spell on you");
    }
 // step 3
    public void eatPlants() {
       System.out.println("I don't eat meat");
    }

    // step 4
    @Override
    public void prototypeMethod() {System.out.println("This method has been overrode");}

    // step 5
    public void prototypeMethod(String string){System.out.println(string);}



}

    /*----------------------------Class End------------------------------*/

public class TheFourConceptsOfOOP {

    //Step 7

    /*----------------------------Instantiation Start----------------------------*/

    static Prototype prototype = new Prototype("Clara", "Bee", 420, 421, "Boom");

    /*----------------------------Instantiation End------------------------------*/

    /*-----------This is the main method that will run the application------------------*/
    public static void main(String[] args) {

        /*----------------------------Methods Start----------------------------*/
        prototype.castSpell();
        prototype.eatPlants();
        prototype.prototypeMethod();
        prototype.prototypeMethod("Tacos");


        /*----------------------------Methods End------------------------------*/
    }
}



/*-----------------------------------------------------------------------------------------------------*/
/*----------------------------------- 1. Abstraction --------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------*/
/*
A class which contains the abstract keyword in its declaration is known as abstract class.
- Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
- But, if a class has at least one abstract method, then the class must be declared abstract.
- If a class is declared abstract, it cannot be instantiated.
- To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
- If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
- You can only extend one abstract class on a subclass
*/
abstract class AbstractionDemo {

    //Since this method is abstract, the class must be declared abstract
    public abstract void sayHello();
}

/*-----------------------------------------------------------------------------------------------------*/
/*----------------------------------- 2. Encapsulation ------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------*/
/*
To achieve encapsulation in Java −
    1- Declare the variables of a class as private.
    2- Provide public setter and getter methods to modify and view the variables values.
*/
class EncapsulationDemo {
    //Step 1: All properties set to PRIVATE
    private String firstname;
    private String lastname;
    private int userId;

    //Step 2: All properties have ACCESSORS(getters) and Mutators(setters)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void prototypeMethod(){}






}

/*-----------------------------------------------------------------------------------------------------*/
/*----------------------------------- 3. Inheritance --------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------*/
/*
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
With the use of inheritance the information is made manageable in a hierarchical order.
The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose
properties are inherited is known as superclass (base class, parent class).
Extends Keyword -
    - extends is the keyword used to inherit the properties of a class. Following is the syntax of extends keyword.
*/
class InheritanceDemo {
    /*Since this class (InheritanceDemo) contains inner classes, all inner classes must be set to static*/

    public static class SuperClass {
        public void superMethod() {
            System.out.println("Super-> SUPER");
        }
    }

    //This class can use/override/overload all methods from SuperClass
    public static class SubClass extends SuperClass {
        @Override
        public void superMethod() {
            System.out.println("Sub-> SUPER");
        }

        public void subMethod() {
            System.out.println("Sub-> SUB");
        }
    }

    //This class can use/override/overload all methods from SubClass and SuperClass
    public static class BasicClass extends SubClass {
        @Override
        public void superMethod() {
            System.out.println("Basic-> SUPER");
        }

        @Override
        public void subMethod() {
            System.out.println("Basic-> SUB");
        }

        public void basicMethod() {
            System.out.println("Basic-> BASIC");
        }

    }
}

/*-----------------------------------------------------------------------------------------------------*/
/*----------------------------------- 4. Interfaces ---------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------*/
/*
Interfaces -
    - must be implemented by a class
    - all methods of implemented interface must be used within the class that uses it
    - typically contains a set of methods
    - multiple interfaces can be implemented
    - implemented methods cannot be overrode or overloaded
    - every implementation can use the implemented methods the way they want but cannot change the parameters
*/
class InterfaceDemo {

    //This interface will allow the implementer to do wizardry
    static interface Wizardry {
        public void castSpell();
    }

    //This interface will allow the implementer to go do employed stuff
    static interface Employed {
        public void goTowork();
    }

    //This class will implement Wizardry and will obtain all its methods
    static class HarryPotter implements Wizardry {
        String name = "Harry";

        public void castSpell() {
            System.out.println(name + " casted a spell!");
        }
    }

    //This class will implement Employed and will obtain all its methods
    static class Employee implements Employed {
        public String name = "Donald";

        public void goTowork() {
            System.out.println(name + " clocked in to work. Boooooooooring.");

        }
    }

    //This class will implement Employed and Wizardry
    static class Magician implements Employed, Wizardry {
        String name = "David Blaine";

        public void goTowork() {
            System.out.println(name + " appeared at work, Magically....");
        }

        public void castSpell() {
            System.out.println(name + " did a magic trick, and it cost the viewer $24..");
        }
    }
}

/*-----------------------------------------------------------------------------------------------------*/
/*-----------------------------------PolyMorphism------------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------*/
/*
Polymorphism is simply a class that has multiple inheritances.
*/
class PolyMorphismDemo {

    public interface Vegetarian {
        public void eatPlants();
    }

    public class Animal {
    }


    //This Deer object is polymorphic because it extends and implements something.
    public class Deer extends Animal implements Vegetarian {
        public void eatPlants() {

        }
    }

    //Because a Deer implements Vegetarian and extends Animal we can
    //have the instantiation of either a Vegetarian or Animal refer to itself as a deer!
    Deer deer = new Deer();
    Vegetarian vegetarian = deer;
    Animal animal = deer;

}
