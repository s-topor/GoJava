package com.student.gojava.module06;

/**
 * Created by toporko on 14.06.2016.
 */
public class Person {
    private String firstName;
    private  String lastName;
    private byte age;
    public  Person(final String firstName, final String lastName,final byte age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
