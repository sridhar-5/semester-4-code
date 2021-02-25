package com.amrita;

import java.text.NumberFormat;
import java.util.Scanner;

public class holiday {
    public String name;
    public int day;
    public String month;
    public holiday(){
        name = "independence day";
        day = 15;
        month = "august";
    }
    public holiday(String n,int d,String m){
        name = n;
        day = d;
        month = m;
    }
    public static boolean inSameMonth(holiday h1, holiday h2){
        if((h1.month).equals(h2.month)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        holiday h1 = new holiday();
        Scanner input = new Scanner(System.in);
        System.out.println("Dayname : ");
        String name = input.nextLine();
        System.out.println("date : ");
        int day = input.nextInt();
        System.out.println("Month : ");
        String month = input.next();
        input.nextLine();    // clears the buffer
        holiday h2 = new holiday(name,day,month);
        System.out.println("Name : ");
        name = input.nextLine();
        System.out.println("day :");
        day = input.nextInt();
        input.nextLine(); // clears the buffer
        System.out.println("month : ");
        month = input.nextLine();
        holiday h3 = new holiday(name,day,month);
        if(holiday.inSameMonth(h1,h2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(holiday.inSameMonth(h1,h3)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(holiday.inSameMonth(h2,h3)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

