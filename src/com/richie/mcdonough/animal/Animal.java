package com.richie.mcdonough.animal;

import java.io.Serializable;

abstract class Animal implements Serializable, Comparable<Animal> {
    public String name;
    public String breed;
    public int size;

    public Animal(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize() {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                '}';
    }

    abstract String sound();

    @Override
    public int compareTo(Animal animal) {
        return animal.getName().compareTo(this.getName());
    }
}
