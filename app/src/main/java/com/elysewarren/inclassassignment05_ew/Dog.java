package com.elysewarren.inclassassignment05_ew;

import java.io.Serializable;

/**
 * Created by elysewarren on 3/1/17.
 */

public class Dog implements Serializable {
    public String dogType;
    public String contactInfo;
    public int age;
    public boolean allergies;

    public Dog(String dogType, int age, String contactInfo,boolean allergies) {

        this.dogType = dogType;
        this.age = age;
        this.contactInfo = contactInfo;
        this.allergies=allergies;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogType='" + dogType + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", age=" + age +
                ", allergies=" + allergies +
                '}';
    }
}



