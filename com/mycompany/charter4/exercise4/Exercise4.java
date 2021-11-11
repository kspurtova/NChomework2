package com.mycompany.charter4.exercise4;

import com.mycompany.charter4.exercise4.Shape;
import com.mycompany.charter4.exercise4.figures.Circle;
import com.mycompany.charter4.exercise4.figures.Line;
import com.mycompany.charter4.exercise4.figures.Rectangle;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Exercise4 {

    public static void main(String[] args) {


        Point p = new Point(0.0, 0.0);

        Shape circle = new Circle(p, 4.0);

        System.out.println(circle);

        Shape circle2 = ((Circle)circle).clone();

        System.out.println(circle2);

        circle2.moveBy(1.0, 1.0);

        System.out.println(circle);
        System.out.println(circle2);


        System.out.println("================");
        Shape rect = new Rectangle(p, 1.0, 2.0);
        Shape rect1 = ((Rectangle)rect).clone();
        System.out.println("rect= " + rect);
        System.out.println("rect1= " + rect1);

        rect1.moveBy(1.0, 1.0);

        System.out.println("rect= " + rect);
        System.out.println("rect1= " + rect1);


        System.out.println("================");
        Point p1 = new Point(2.0, 3.0);
        Shape line = new Line(p, p1);
        Shape line1 = ((Line)line).clone();
        System.out.println("line= " + line);
        System.out.println("line1= " + line1);

        line1.moveBy(1.0, 1.0);

        System.out.println("line= " + line);
        System.out.println("line1= " + line1);



    }


}
