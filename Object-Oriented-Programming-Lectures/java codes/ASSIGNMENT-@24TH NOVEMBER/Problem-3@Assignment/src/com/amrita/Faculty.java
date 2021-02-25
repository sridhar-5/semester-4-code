package com.amrita;

public class Faculty extends Person{

    private static int IDVar = 0000;

    private String ID;

    public Faculty(String name,int age,String gender)
    {
        super(name,age,gender);
        IDVar++;
        String IDno = Integer.toString(IDVar);
        ID = "F" + IDno;
    }

    public void list_name(int age)
    {
        if(age==super.ret_age())
        {
            System.out.println(super.Name);
        }
    }

    @Override
    public void count() {
        super.count();
        System.out.println("Number of faculty: " + IDVar);
    }


}