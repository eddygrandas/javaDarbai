package com.company;

public class Circle extends Shape{
    private int radius;

    Circle(String c, String t, int r) {
        super(c, t);
        this.radius=r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

}
