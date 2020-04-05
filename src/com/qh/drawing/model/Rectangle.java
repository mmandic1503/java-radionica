package com.qh.drawing.model;

public class Rectangle {
    private Point upperLeftPoint;
    private int height;
    private int wight;
    private boolean selected;

    public Rectangle(Point upperRightPoint, int height, int wight) {
        this.upperLeftPoint = upperRightPoint;
        this.height = height;
        this.wight = wight;
    }

    public Rectangle(Point upperRightPoint, int height, int wight, boolean selected) {
        this(upperRightPoint, height, wight);
        this.selected = selected;
    }

    public Point getUpperRightPoint() {
        return upperLeftPoint;
    }

    public void setUpperRightPoint(Point upperRightPoint) {
        this.upperLeftPoint = upperRightPoint;
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

    public boolean contains(Point p) {
        boolean containsX = p.getX() > upperLeftPoint.getX() && p.getX() < this.upperLeftPoint.getX() + this.wight;
        boolean containsY = p.getY() > upperLeftPoint.getY() && p.getX() < this.upperLeftPoint.getY() + this.height;
        return containsX && containsY;
    }

    public boolean contains(int x, int y) {
        return contains(new Point(x, y));
    }

    public Point lowerRight() {
        return new Point(this.upperLeftPoint.getX() + this.wight, this.upperLeftPoint.getY() + height);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            return this.upperLeftPoint.equals(rectangle.upperLeftPoint) && this.height == rectangle.height && this.height == rectangle.height;
        }
        return false;
    }
}
