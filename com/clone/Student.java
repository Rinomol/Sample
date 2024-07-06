package com.clone;

public class Student implements Cloneable {
    int studid;
    String studname;
    Student(int studid,String studname){
        this.studid=studid;
        this.studname=studname;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student studone = new Student(1,"Ravi");
            Student studtwo = (Student) studone.clone();
            System.out.println("Id is : " +studone.studname);
            System.out.println("Name is: " +studtwo.studname);
        }catch (CloneNotSupportedException c){
            c.printStackTrace();
        }
    }
}
