package com.company.Abstracts;

/**
 * Created by Ramel Henderson
 * on 11/11/2016.
 */
public abstract class Person {
    String firstName;
    String lastName;
    int weightLbs;
    int heightIn;
    String hairColor;
    String sex;
    String ethnicity;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(int weightLbs) {
        this.weightLbs = weightLbs;
    }

    public int getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(int heightIn) {
        this.heightIn = heightIn;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSex() {
        return sex;
    }

    public final void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
