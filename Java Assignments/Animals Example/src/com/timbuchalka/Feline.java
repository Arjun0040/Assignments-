package com.timbuchalka;

public class Feline extends Animal {
    protected String fightMethod;
    public Feline(int size, String fightMethod) {
        super(size);
        fightMethod = fightMethod;
    }

    public String getFightMethod() {
        return fightMethod;
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
