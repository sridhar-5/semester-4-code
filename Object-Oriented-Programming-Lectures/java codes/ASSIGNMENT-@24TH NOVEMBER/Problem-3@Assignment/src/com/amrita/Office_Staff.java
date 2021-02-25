package com.amrita;

import javax.naming.Name;

public class Office_Staff extends Person{

    private String ID;
    private static int IDVar = 0000;

    public Office_Staff(String name, int age, String gender)
    {
        super(name, age, gender);
        IDVar++;
        String IDno = Integer.toString(IDVar);
        ID = "O" + IDno;
    }

    public void list_age(String name)
    {
        int index = super.Name.indexOf(name);

        if(index>=0)
        {
            System.out.println("Age of " + Name + " = " + super.ret_age());
        }

    }

    @Override
    public void count() {
        super.count();
        System.out.println("Number of office staff: " + IDVar);
    }
}