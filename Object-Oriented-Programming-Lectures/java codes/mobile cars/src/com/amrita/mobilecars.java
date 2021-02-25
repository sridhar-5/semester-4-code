package com.amrita;

import java.util.Scanner;

public class mobilecars{
    public String company_name;
    public float price;
    public String model_name;
    public int year;
    public mobilecars(){
        System.out.println("-----------------------Constructor called-----------------");
        company_name = "Toyota";
        price = 50000;
        model_name = "Fortunner";
        year = 2015;
        System.out.println("----------------------constructor ends--------------------");
    }

    public void car_details_input(){
        System.out.println("Please enter the company of the car : ");
        Scanner input = new Scanner(System.in);
        company_name = input.next();
        System.out.println("Please enter the model_name of the car : ");
        model_name = input.next();
        System.out.println("Please enter the price of car : ");
        price = input.nextFloat();
    }
    public void display(){
        System.out.println(" The company of the car : " +company_name);
        System.out.println("The model_name of the car : " +model_name);
        System.out.println("The price of the car : " +price );
        System.out.println("The year of projection is : " +year);
    }
}
class Main{
    public static void main(String[] args){
        mobilecars m1 = new mobilecars();
        m1.car_details_input();
        m1.display();
        problem dummyBook = new problem("Java for dummies", "ahTeck", 9.99, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);

        System.out.println("name is: " + dummyBook.getName());

        System.out.println("author's name is: " + dummyBook.getAuthor());

        System.out.println("price is: " + dummyBook.getPrice());

        System.out.println("qty is: " + dummyBook.getQty());
    }
}