package com.richie.mcdonough.animal;

public class Cat extends Animal{
    public Cat(String name, String breed, int size) {
        super(name, breed, size);
    }

    @Override
    String sound() {
        return "meow";
    }
}
