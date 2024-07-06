package com.oops.inheritance.single;

public class Single {
    public static void main(String[] args) {
        System.out.println("Details are:");
        new Employee("1","Rino","25","2000");
    }
}
class Programmer{
    String id;
    String name;
    String age;
    Programmer(String id,String name, String age){
        this.id=id;
        this.name=name;
        this.age=age;
        System.out.println("Id is:"+id);
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
}
class Employee extends Programmer{
    String salary;
    Employee(String id,String name, String age, String salary){
        super(id,name,age);
        this.salary=salary;
        System.out.println("Salary is:"+salary);
    }
}