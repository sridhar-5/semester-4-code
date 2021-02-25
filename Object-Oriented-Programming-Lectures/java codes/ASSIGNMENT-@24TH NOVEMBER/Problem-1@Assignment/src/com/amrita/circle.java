package com.amrita;

public class circle {
    // private instance variables
    private double radius;
    private String color;

    // Constructors
    public circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Construced a Circle with Circle()");  // for debugging
    }
    public circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Construced a Circle with Circle(radius)");  // for debugging
    }
    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius, color)");  // for debugging
    }

    // public getters and setters for the private variables
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    /** Returns the area of this Circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}


