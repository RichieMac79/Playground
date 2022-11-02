package com.richie.mcdonough.shapes;

import java.lang.Math;

public class Circle extends Shapes{
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        area = Math.PI * (radius * radius);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}