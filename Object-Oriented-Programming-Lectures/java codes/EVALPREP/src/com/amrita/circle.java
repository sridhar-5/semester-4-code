package com.amrita;

import java.util.*;

public class circle{
    public double radius;
    public String color;

    circle(){
        this.radius = 3;
        this.color = "Blue";
    }
    circle(double ra, String col)
    {
        this.radius = ra;
        this.color = col;

    }

    public static boolean checkSame(circle c1, circle c2){
        if(c1.radius == c2.radius || c1.color == c2.color){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String color;
        double radius;
        circle c1,c2,c3;

        c1 = new circle();

        color = in.nextLine();
        radius = in.nextDouble();

        c2 = new circle(radius,color);


        String col = in.nextLine();
        double rad = in.nextDouble();

        c3 = new circle(rad,col);

        if(circle.checkSame(c1,c2))
            System.out.println("True");
        else
            System.out.println("False");

        if(circle.checkSame(c1,c3))
            System.out.println("True");
        else
            System.out.println("False");

        if(circle.checkSame(c2,c3))
            System.out.println("True");
        else
            System.out.println("False");
    }
}