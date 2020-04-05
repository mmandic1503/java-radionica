package com.qh.drawing.model;

public class Point {
    private int x;
    private int y;
    private boolean selected;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, boolean selected) {
        this(x, y);
        this.selected = selected;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double distance(Point p) {
        int px = this.x - p.x;
        int py = this.y - p.y;
        return Math.sqrt(px * px + py * py);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Point) {
            Point point = (Point) object;
            return this.x == point.x && this.y == point.y;
        }
        return false;
    }
}
