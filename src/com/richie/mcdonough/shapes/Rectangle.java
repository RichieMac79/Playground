package com.richie.mcdonough.shapes;

public class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth(double width) {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength(double length) {
        return length;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void calculateArea() {
        area = (length * width);
    }
}
