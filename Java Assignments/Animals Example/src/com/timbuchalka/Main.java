package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	   Animal dog = new Dog(20, 3);
	   dog.makeSound();
	   System.out.println(dog.getSize());

	   Animal cat = new Cat(8, "Paws");
	   cat.eat();
	   System.out.println(cat.getSize());
    }
}
