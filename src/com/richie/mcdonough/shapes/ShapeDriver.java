package com.richie.mcdonough.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeDriver {
    public static void main(String[] args) {
        List<Shapes> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(2.0, 3.0));
        shapes.add(new Circle(3.0));
        shapes.add(new Rectangle(3.0, 4.0));
        shapes.add(new Circle(4.0));
        shapes.add(new Rectangle(4.0, 5.0));

        System.out.println("The largest shape is: " + largestShape(shapes));
    }

    public static Shapes largestShape(List<Shapes> list) {
        Shapes largestShape = list.get(0);

        for (Shapes shape : list) {
            if (shape.compareShapes(largestShape) == 1) {
                largestShape = shape;
            }
        }

        return largestShape;
    }
}