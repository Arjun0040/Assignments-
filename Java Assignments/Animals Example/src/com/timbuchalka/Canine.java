package com.timbuchalka;

public class Canine extends  Animal {
    public Canine(int size) {
        super(size);
    }

    @Override
    void roam() {
        System.out.println("Roaming");
    }

    @Override
    void eat() {
        System.out.println("Eating");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    void makeSound() {
        System.out.println("Making sound");
    }
}
