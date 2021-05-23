package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person("Arjun");
        System.out.println(person.getId() +": " +person.getName());

        Person me = new Person();
        System.out.println(me.getId());
    }
}
