package com.timbuchalka;

public class PlaySchool extends School {
    public PlaySchool(Student student) {
        super(student);
    }

    public void play() {
        System.out.println("Playing");
    }
    public void singRhymes() {
        System.out.println("Baba Black sheep..");
    }

    public void learnBasics() {
        System.out.println("A, B, C, D..");
    }
}
