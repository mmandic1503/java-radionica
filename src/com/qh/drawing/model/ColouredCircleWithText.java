package com.qh.drawing.model;

import sun.lwawt.macosx.CImage;

public class ColouredCircleWithText extends Circle {
    String text;

    public ColouredCircleWithText(Point center, int radius, String text) {
        super(center, radius);
        this.text = text;
    }

    public ColouredCircleWithText(Point center, int radius, boolean selected, String text) {
        super(center, radius, selected);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
