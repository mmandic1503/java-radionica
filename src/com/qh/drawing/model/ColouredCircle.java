package com.qh.drawing.model;

import java.awt.*;

public class ColouredCircle extends Circle {
    Color colour;

    public ColouredCircle(Point center, int radius, Color colour) {
        super(center, radius);
        this.colour = colour;
    }

    public ColouredCircle(Point center, int radius, boolean selected, Color colour) {
        super(center, radius, selected);
        this.colour = colour;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
}
