package com.student.gojava.module06;


import java.util.ArrayList;
import java.util.List;

public class PersonExample {
    public static void main(String[] args) {
        final List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Dgo","Doe", (byte) 23));
        personsList.add(new Person("bro","Elo", (byte) 45));
        personsList.add(new Person("Fill","Elfofo",(byte)23));
        for (Person person : personsList){
            System.out.println(person);
        }
        personsList
                .stream()
                .map(person -> person.getLastName())
                .forEach(lastName -> System.out.println(lastName));
    }


}
