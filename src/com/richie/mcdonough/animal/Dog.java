package com.richie.mcdonough.animal;

public class Dog extends Animal{
    public Dog(String name, String breed, int size) {
        super(name, breed, size);
    }

    @Override
    String sound() {
        return "woof";
    }
}
