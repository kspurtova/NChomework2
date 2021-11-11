package com.mycompany.charter4.exercise4;

public abstract class Shape extends Point{

    protected Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public Shape(double x, double y) {
        super(x, y);
    }

    public void moveBy(double dx, double dy) {
        super.setX( super.getX() + dx);
        super.setY( super.getY() + dy);
    }

    abstract public Point getCenter();
}
