package com.amrita;

import java.util.Scanner;

public class factorial {
    public int n;
    public int facto;
    public factorial(int fact){
        n = fact;
        facto = 1;
    }
    public void factor(){
        int i;
        for(i = n;i >= 1;i--){
            facto = facto * i;
        }
        System.out.println(facto);
    }
    public static void main(String[] args){
        int s;
        Scanner input = new Scanner(System.in);
        s = input.nextInt();
        factorial f1 = new factorial(s);
        f1.factor();
    }
}
