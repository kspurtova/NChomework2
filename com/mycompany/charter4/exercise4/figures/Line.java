package com.mycompany.charter4.exercise4.figures;

import com.mycompany.charter4.exercise4.Point;
import com.mycompany.charter4.exercise4.Shape;

public class Line extends Shape {


    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public Line clone() {
        Line cloned = new Line(p, to);
        cloned.p = new Point(p);
        return cloned;
    }
}
