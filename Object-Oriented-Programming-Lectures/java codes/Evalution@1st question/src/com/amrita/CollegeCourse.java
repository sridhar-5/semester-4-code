package com.amrita;

public class CollegeCourse {
    public String Department;
    public int Coursenumber;
    public int Credithours;
    public long tution_fee;

    CollegeCourse(){
        this.Department = "";
        this.Coursenumber = 0;
        this.Credithours = 0;
        this.tution_fee = 0;
    }
    //PARAMETRISED CONSTRUCTOR
    CollegeCourse(String Department,int Coursenumber,int Credithours,long tution_fee){
        this.Department = Department;
        this.Coursenumber = Coursenumber;
        this.Credithours = Credithours;
        this.tution_fee = tution_fee;

        //checking for the constraint
        if(Credithours < 20){
            System.out.println("less credit hours");
            return;
        }
        else if(Credithours > 20 ){
            System.out.println("More credit hours");
            return;
        }
        if(Coursenumber < 200 && Coursenumber > 208){
            System.out.println("Invalid course code");
            return;
        }
    }


}
