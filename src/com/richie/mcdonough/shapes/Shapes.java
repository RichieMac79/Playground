package com.richie.mcdonough.shapes;

public abstract class Shapes implements ShapesRelate {
    protected double area;
    public Shapes(){
        this.area = 0.0;
    }
    public double getArea() {
        return this.area;
    }
    abstract void calculateArea();

    public int compareShapes(ShapesRelate other) {
        Shapes shape = (Shapes) other;
        if(this.getArea() > shape.getArea()) {
            return 1;
        }
        return 0;
    }
}
