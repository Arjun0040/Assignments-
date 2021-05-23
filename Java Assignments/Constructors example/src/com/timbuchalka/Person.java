package com.timbuchalka;

public class Person {
    private String name;
    private static int id = 0;

    public Person () {
        id += 1;
    }

    public Person(String name) {
        this.name = name;
        id += 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
