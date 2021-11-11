package com.mycompany.charter4.exercise4.figures;

import com.mycompany.charter4.exercise4.Point;
import com.mycompany.charter4.exercise4.Shape;

public class Circle extends Shape implements Cloneable{

    private double radius = 0.0;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public Circle clone() {
        Circle cloned = new Circle(p, radius);
        cloned.p = new Point(p);
        return cloned;
    }
}
