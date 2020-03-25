package com.qh.drawing.test;

import com.qh.drawing.model.Circle;
import com.qh.drawing.model.Point;
import com.qh.drawing.model.Rectangle;

public class TestGeometry {

    public static void main(String[] args) {
	    Point p1 = new Point(0, 0);
	    Point p2 = new Point(3, 4);
	    Point p3 = new Point(5, 6);
	    Point p4 = new Point(10, 20, true);
	    Point p5 = p3;
	    Point p6 = new Point(p3.getX(), p3.getY());

	    p3.setSelected(p4.isSelected());;
	    p3.setX(9);

        System.out.println("P3 is: " + p3.getX() + ", " + p3.getY() + ", " + p3.isSelected());
        System.out.println("P4 is: " + p4.getX() + ", " + p4.getY() + ", " + p4.isSelected());
        System.out.println("P5 X is: " + p5.getX());
        System.out.println("P6 is: " + p6.getX() + ", " + p6.getY());

	    double distance = p1.distance(p2);
        System.out.println("Distance is: " + distance);

        Circle circle = new Circle(p1, 3);
        System.out.println("Circle area is: " + circle.area());

        Rectangle rectangle = new Rectangle(p1, 4, 6);
        System.out.println("Rectangle area is: " + rectangle.area());
    }
}
