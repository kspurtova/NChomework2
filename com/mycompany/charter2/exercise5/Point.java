package com.mycompany.charter2.exercise5;

public class Point {

    private double x=0.0;
    private double y=0.0;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point (Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate (double moveX, double moveY) {
        Point result = new Point(this);
        result.x+=moveX;
        result.y+=moveY;
        return result;
    }

    public Point scale (double k) {
        Point result = new Point(this);
        result.x*=k;
        result.y*=k;
        return result;
    }

    @Override
    public String toString() {
        return "Point(" +
                "" + x +
                ", " + y +
                ')';
    }
}
