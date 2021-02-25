package com.amrita;

import java.util.Scanner;

public class primenos {
    public int n;
    public primenos(int range){
        n = range;
    }
    public void prime(){
        int i,count,j;
        for(i = 2; i <= n;i++){
            count = 0;
            for(j = 1;j <= i;j++){
                if(i % j == 0){
                    count = count + 1;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        primenos p1 = new primenos(range);
        p1.prime();
    }
}
