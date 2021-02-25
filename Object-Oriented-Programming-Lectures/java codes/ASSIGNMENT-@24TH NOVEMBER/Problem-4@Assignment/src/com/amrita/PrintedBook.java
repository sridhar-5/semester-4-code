package com.amrita;

public class PrintedBook extends Media{
    public int pages;
    PrintedBook(String title,String author,int year,String language,double price,int pages){
        super(title,author,year,language,price);
        this.pages = pages;
    }
    @Override
    public void ListDetails(){
        super.ListDetails();
        System.out.println("No of pages in the Book :"+pages);
    }
}
