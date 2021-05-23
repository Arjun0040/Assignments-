package com.timbuchalka;

public abstract class Animal {
    private int size;

    public Animal(int size) {

        this.size = size;

    }

    abstract void roam();

    abstract void eat();

    abstract void sleep();

    abstract void makeSound();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
