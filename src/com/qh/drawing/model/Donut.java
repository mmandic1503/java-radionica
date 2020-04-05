package com.qh.drawing.model;

public class Donut extends Circle{
    public int innerRadius;

    public Donut(Point center, int radius) {
        super(center, radius);
    }

    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    @Override
    public double area() {
        return super.area() - this.innerRadius * this.innerRadius * Math.PI;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Donut) {
            Donut donut = (Donut) object;
            return super.equals(donut) && this.innerRadius == donut.innerRadius;

        }
        return false;
    }

}
