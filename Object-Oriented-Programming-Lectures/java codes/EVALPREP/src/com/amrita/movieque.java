package com.amrita;

import java.util.*;

public class movieque{
    public String title;
    public String studio;
    public String rating;

    movieque(){
        this.title = "Casino Royale";
        this.studio = "Eon Productions";
        this.rating = "R";
    }
    movieque(String t, String st, String ra)
    {
        this.title = t;
        this.studio = st;
        this.rating = ra;
    }

    public static boolean checkSameStudio(movieque m1, movieque m2){
        if(m1.studio.equals(m2.studio)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String title,studio,rating;
        movieque m1,m2,m3;

        m1 = new movieque();

        title = in.nextLine();
        studio = in.nextLine();
        rating = in.nextLine();
        m2 = new movieque(title,studio,rating);

        String title2 = in.nextLine();
        String studio2 = in.nextLine();
        String rating2 = in.nextLine();
        m3 = new movieque(title2,studio2,rating2);

        if(movieque.checkSameStudio(m1,m2))
            System.out.println("True");
        else
            System.out.println("False");

        if(movieque.checkSameStudio(m1,m3))
            System.out.println("True");
        else
            System.out.println("False");

        if(movieque.checkSameStudio(m2,m3))
            System.out.println("True");
        else
            System.out.println("False");
    }
}