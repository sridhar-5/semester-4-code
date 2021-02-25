package com.amrita;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Main {
    public String title;
    public String author;
    public int year;
    public String language;
    public double price;

    public void getinputs(){
        Scanner input = new Scanner(System.in);
        System.out.println("Title : ");
        title = input.nextLine();
        System.out.println("Author : ");
        author = input.nextLine();
        System.out.println("year : ");
        year = input.nextInt();
        System.out.println("language : ");
        input.nextLine();
        language = input.nextLine();
        System.out.println("price : ");
        price = input.nextDouble();
    }
    public void printedmedia(){
        Scanner input = new Scanner(System.in);
        getinputs();
        System.out.println("No of pages for the Book : ");
        int pages = input.nextInt();
        PrintedBook z = new PrintedBook(title,author,year,language,price,pages);
        z.ListDetails();
        System.out.println("inputs for news paper : ");
        getinputs();
        System.out.println("No of pages for the News paper : ");
        pages = input.nextInt();
        PrintedNewsPaper x = new PrintedNewsPaper(title,author,year,language,price,pages);
        x.ListDetails();
    }
    public void ElectronicMedia(){
        Scanner input = new Scanner(System.in);
        System.out.println("please give the inputs for the Electronic tape Media : ");
        getinputs();
        System.out.println("Duration of the tape : ");
        int duration = input.nextInt();
        Tape z = new Tape(title,author,year,language,price,duration);
        z.ListDetails();
        System.out.println("inputs for Disk : ");
        getinputs();
        System.out.println("Duaration of Disk : ");
        duration = input.nextInt();
        PrintedNewsPaper x = new PrintedNewsPaper(title,author,year,language,price,duration);
        x.ListDetails();
    }
    public static void main(String []args){
        System.out.println("================please select an option=====================");
        System.out.println("1. Printed Media ");
        System.out.println("2. Electronic Media");
        System.out.println("=================END=========================================");
        Scanner input = new Scanner(System.in);
        System.out.println("please select an option : ");
        int option = input.nextInt();
        Main G = new Main();
        if (option == 1){
            G.printedmedia();
        }
        else if(option == 2){
            G.ElectronicMedia();
        }
    }
}
