package com.mycompany.charter4.exercise4.figures;

import com.mycompany.charter4.exercise4.Point;
import com.mycompany.charter4.exercise4.Shape;

public class Rectangle extends Shape {

    private double width = 0.0;
    private double height = 0.0;


    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public Rectangle clone() {
        Rectangle cloned = new Rectangle(p, width, height);
        cloned.p = new Point(p);
        return cloned;
    }
}
