package com.amritalab;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        Long custID;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Customer_Id : ");
        custID = input.nextLong();
        System.out.println(" \n Please enter your name : ");
        String name ;
        name = input.nextLine();
        float units;
        System.out.print("\n please enter no of units of usage :");
        units = input.nextFloat();
        double rate;
        if (units <= 199)
        {
            rate = (units * 1.20);
        }
        else if (units >= 200 && units < 400)
        {
            rate = (units * 1.50);
        }
        else if (units >= 400 && units < 600)
        {
            rate = (units * 1.80);
        }
        else if (units > 600)
        {
            rate = (units * 2);
        }
        double surcharge;
        if (rate > 400)
        {
            surcharge = (rate * 0.15);
            rate = rate + surcharge;
        }
        System.out.println("CustomerID : " +custID);
        System.out.println("CustomerName : "+name);
        System.out.println("Units consumed : " + units);
        System.out.println("Amount charged : " + rate);
        System.out.println("surcharge amount : " +surcharge);

    }
}
