package com.amrita;

import java.util.Scanner;

public class Arraysum {
    public int n;
    public Arraysum(int size){
        n = size;
    }
    public void sum(){
        int[] array = new int[n];
        int i,sum = 0;
        Scanner input = new Scanner(System.in);
        for(i = 0;i<n;i++){
            array[i] = input.nextInt();
        }
        for(i = 0; i < n;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Arraysum a1 = new Arraysum(size);
        a1.sum();
    }
}
