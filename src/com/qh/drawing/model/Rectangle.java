package com.qh.drawing.model;

public class Rectangle {
    private Point upperRightPoint;
    private int height;
    private int wight;
    private boolean selected;

    public Rectangle(Point upperRightPoint, int height, int wight) {
        this.upperRightPoint = upperRightPoint;
        this.height = height;
        this.wight = wight;
    }

    public Rectangle(Point upperRightPoint, int height, int wight, boolean selected) {
        this(upperRightPoint, height, wight);
        this.selected = selected;
    }

    public Point getUpperRightPoint() {
        return upperRightPoint;
    }

    public void setUpperRightPoint(Point upperRightPoint) {
        this.upperRightPoint = upperRightPoint;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double area() {
        return this.wight * this.height;
    }

}
