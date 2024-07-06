package com.constructor;

public class NonArgumentConstructor {
    private String empname;
    private int empid;
    private double empsalary;
    NonArgumentConstructor(){
        System.out.println("default constructor");
        empname = "Rino";
        empid = 101;
        empsalary = 20560;
        System.out.println("Employee name:" +empname +"," +"Employee id:" +empid +"," +"Employee salary:" +empsalary );

    }
    void employeeInformtion(){
        System.out.println("Employee name:" +empname +"," +"Employee id:" +empid +"," +"Employee salary:" +empsalary );

    }
    public static void main(String[] args) {
    new NonArgumentConstructor();
    NonArgumentConstructor nonargcon = new NonArgumentConstructor();
    nonargcon.employeeInformtion();
    }
}
