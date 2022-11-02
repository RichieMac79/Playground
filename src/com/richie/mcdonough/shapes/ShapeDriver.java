package com.richie.mcdonough.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Shapes[] shapes = new Shapes[2];
        int[] numbers = new int[2];
        int firstNumber = 5;
        int[] number = new int[2];
        number[0] = firstNumber;
        ArrayList<Shapes> shapesList = new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(rectangle);
        largestShape(shapesList);
        Shapes biggestShape = null;
        biggestShape = largestShape(shapesList);
    }
    public static Shapes largestShape(List<Shapes> list){
    Shapes reallyBigShape = list.get(0);
    for (int i = 0; i < list.size(); i++) {
        list.get(i).calculateArea();
        if((list.get(i).compareShapes(reallyBigShape)) > 0) {
            reallyBigShape = list.get(i);
        }
    }
    return reallyBigShape;
    }
}