package com.amrita;

public class PrintedNewsPaper extends Media{
    public int pages;
    PrintedNewsPaper(String title,String author,int year,String language,double price,int pages){
        super(title,author,year,language,price);
        this.pages = pages;
    }
    @Override
    public void ListDetails(){
        super.ListDetails();
        System.out.println("No of pages in the NewsPaper :"+pages);
    }
}
