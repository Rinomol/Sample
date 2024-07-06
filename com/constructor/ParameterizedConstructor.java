package com.constructor;

public class ParameterizedConstructor {
    String empname;
    String empage;
    String empsalary;
    ParameterizedConstructor(String empname, String empage, String empsalary){
        this.empname = empname;
        this.empage = empage;
        this.empsalary = empsalary;
        System.out.println("Employee name:" +empname);
        System.out.println("Employee age:" +empage);
        System.out.println("Employee salary:" +empsalary);
    }
    public static void main(String[] args) {
        new ParameterizedConstructor("Rino", "25", "25000");
    }
}
