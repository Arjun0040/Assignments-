package com.timbuchalka;

public class Dog extends Canine implements Pet {
    private int collor;
    public Dog(int size, int collor) {
        super(size);
        this.collor = collor;
    }

    @Override
    void makeSound() {
        System.out.println("BOW BOW");
    }

    @Override
    public void playAround() {
        System.out.println("PlayTime!");
    }

    @Override
    public void guardHouse() {
        System.out.println("Guarding!");
    }
}
