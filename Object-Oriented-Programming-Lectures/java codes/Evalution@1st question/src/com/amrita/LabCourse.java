package com.amrita;

public class LabCourse extends CollegeCourse{
    public long lab_fee_charged;
    public long total_fee;
    //creating a parametrized constructor

    LabCourse(String Department,int Coursenumber,int Credithours,long tution_fee,long lab_fee_charged){
        super(Department,Coursenumber,Credithours,tution_fee);
        this.lab_fee_charged = lab_fee_charged;
    }
    public long calculate_total_fee(){
        total_fee = tution_fee + lab_fee_charged;
        return total_fee;
    }
}
