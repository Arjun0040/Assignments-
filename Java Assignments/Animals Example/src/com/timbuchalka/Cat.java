package com.timbuchalka;

public class Cat extends Feline {
    public Cat(int size, String fightMethod) {
        super(size, fightMethod);
    }


    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }


}
