package com.amrita;

public class TestCylinder {
    public static void main(String[] args) {
        //object 1
        cylinder cy1 = new cylinder();
        System.out.println("Radius is " + cy1.getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getColor()
                + ", Base area is " + cy1.getArea()
                + ", Volume is " + cy1.getVolume());

        //object 2
        cylinder cy2 = new cylinder(5.0, 2.0);
        //Construced a Circle with Circle(radius)
        //Constructed a Cylinder with Cylinder(height, radius)
        System.out.println("Radius is " + cy2.getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Base area is " + cy2.getArea()
                + ", Volume is " + cy2.getVolume());
    }
}
