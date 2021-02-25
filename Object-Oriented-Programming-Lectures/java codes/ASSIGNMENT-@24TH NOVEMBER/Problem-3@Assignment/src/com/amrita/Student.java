package com.amrita;

    public class Student extends Person{

        private String ID;

        private static int IDVar = 0000;

        public Student(String name, int age, String gender)
        {
            super(name,age,gender);
            IDVar++;
            String IDno = Integer.toString(IDVar);
            ID = "S" + IDno;
        }

        @Override
        public void count() {
            super.count();
            System.out.println("Number of students: " + IDVar);
        }
    }

