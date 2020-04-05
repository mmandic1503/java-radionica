package com.qh.drawing.model;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    private boolean selected;

    public double length() {
        return startPoint.distance(endPoint);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Line) {
            Line line = (Line) object;
            return this.startPoint.equals(line.startPoint);
        }
        return false;
    }

}
