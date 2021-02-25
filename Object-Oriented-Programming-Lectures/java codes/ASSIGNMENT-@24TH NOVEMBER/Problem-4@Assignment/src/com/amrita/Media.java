package com.amrita;

public class Media {
    public String title;
    public String Author;
    public int year;
    public String language;
    public double price;

    Media(){
        this.title = "";
        this.Author = "";
        this.year = 0;
        this.language = "";
        this.price = 0;
    }
    Media(String title,String Author,int year,String language,double price){
        this.title = title;
        this.Author = Author;
        this.year = year;
        this.language = language;
        this.price = price;
    }
    public void ListDetails(){
        System.out.println("Title : " +title);
        System.out.println("Author :" +Author);
        System.out.println("The year of Publishing : " +year);
        System.out.println("Language :" +language);
        System.out.println("Price : "+price);
    }
}
