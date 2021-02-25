package com.amrita;

public class cylinder extends circle{
    private double height;

    // Constructors
    public cylinder() {
        super();
        this.height = 1.0;
    }
    public cylinder(double height) {
        super();
        this.height = height;
    }
    public cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    /** Returns the volume of this Cylinder */
    public double getVolume() {
        return getArea()*height;   // Use Circle's getArea()
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "This is a Cylinder";  // to be refined later
    }
}
