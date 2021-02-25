package com.amrita;

import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String Department = input.next();
        int Courseno = input.nextInt();
        int Credithours = input.nextInt();
        long tution_fee = input.nextLong();
        long lab_fee = input.nextLong();
        LabCourse x = new LabCourse(Department,Courseno,Credithours,tution_fee,lab_fee);
        System.out.println("Department is "+x.Department);
        System.out.println("Course number is "+x.Coursenumber);
        System.out.println("Credit hours is " +x.Credithours);
        System.out.println("Tution fee is "+x.tution_fee);
        System.out.println("Labfee " +x.lab_fee_charged);
        System.out.println("Total Fees "+x.calculate_total_fee());
    }
}
