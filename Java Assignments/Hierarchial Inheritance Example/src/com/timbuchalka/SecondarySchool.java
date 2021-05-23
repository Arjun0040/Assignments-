package com.timbuchalka;

public class SecondarySchool extends School {
    public SecondarySchool(Student student) {
        super(student);
    }

    public void doMath() {
        System.out.println("1 + 1 = ...");
    }

    public void writeNotes() {
        System.out.println("This is the most complete notes ever!");
    }
}
