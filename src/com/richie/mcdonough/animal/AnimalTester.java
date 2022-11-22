package com.richie.mcdonough.animal;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AnimalTester {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LinkedList<Animal> animals = new LinkedList<Animal>();

        animals.add(new Cat("Mittens", "Siamese", 3));
        animals.add(new Dog("Barney", "Sausage Dog", 6));
        animals.add(new Dog("Ginger", "Labrador", 4));

        System.out.println(animals);

        Collections.sort(animals);

        System.out.println(animals);

        class BreedCompare implements Comparator<Animal> {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getBreed().compareTo(a2.getBreed());
            }

        }

        BreedCompare compareBreed = new BreedCompare();
        Collections.sort(animals, compareBreed);

        System.out.println(animals);


        class SizeCompare implements Comparator<Animal>{
            @Override
            public int compare(Animal a1, Animal a2) {
                if(a1.getSize() > a2.getSize()) return 1;
                else if(a2.getSize() > a1.getSize()) return -1;
                else return 0;
            }
        }

        SizeCompare compareSize = new SizeCompare();
        Collections.sort(animals, compareSize);

        System.out.println(animals);

        serialize(animals);
        deserialize();
    }

    public static void serialize(LinkedList<Animal> animals) throws IOException, ClassNotFoundException {

        FileOutputStream fileStream = new FileOutputStream("testSerAnimal.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileStream);
        for (Animal animal : animals) {
            out.writeObject(animal);
        }
        out.close();
        fileStream.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("testSerAnimal.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        try {
            Animal animal;
            while ((animal = (Animal) in.readObject()) != null) {
                System.out.println(animal);
            }
        }
        catch(EOFException ex) {}
        in.close();
        fileIn.close();
    }

}
