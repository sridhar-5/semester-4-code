package com.amrita;

public class Person {

    public String Name;
    private int Age;
    private String Gender;
    private static int Population = 0;

    public Person(String name,int age,String gender)
    {
        Population++;
        Name = name;
        Age = age;
        Gender = gender;
    }

    public void ID_females()
    {
        if((Gender.equals("F"))&&(Age<51)&&(Age>=15))
        {
            System.out.println(Name + "is female.");
        }
    }

    public int ret_age()
    {
        return Age;
    }

    public void count()
    {
        System.out.println("The number of people is " + Population);
    }


}