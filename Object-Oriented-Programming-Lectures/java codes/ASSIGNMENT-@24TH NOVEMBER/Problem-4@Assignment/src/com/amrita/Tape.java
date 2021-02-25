package com.amrita;

public class Tape extends Media{
    public int duration;
    Tape(String title,String author,int year,String language,double price,int duration){
        super(title,author,year,language,price);
        this.duration = duration;
    }
    @Override
    public void ListDetails(){
        super.ListDetails();
        System.out.println("No of pages in the Book :"+duration);
    }
}