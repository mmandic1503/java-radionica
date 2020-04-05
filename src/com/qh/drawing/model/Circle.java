package com.qh.drawing.model;

public class Circle {
    private Point center;
    private int radius;
    private boolean selected;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, int radius, boolean selected) {
        this(center, radius);
        this.selected = selected;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public boolean contains(Point p) {
        return this.center.distance(p) <= this.getRadius();
    }

    public boolean contains(int x, int y) {
        Point p = new Point(x, y);
        return this.contains(p);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Circle) {
            Circle circle = (Circle) object;
            return this.center.equals(circle.center) && this.radius == circle.radius;
        }
        return false;
    }
}
