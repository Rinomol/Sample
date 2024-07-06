package com.keyword.superexample;

public class VariableLevel {
    public static void main(String[] args) {
        B b=new B(1,"Roja","CSE","Mar Ephraem");
        b.show();
        b.display();
    }
}
class A{
    int id;
    String name;
    String dept;
    A(int id, String name, String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    public void show(){
        System.out.println("ID : "+id+"\nNAME : "+name+"\nDEPARTMENT : "+dept);
    }
}

class B extends A{
    String college;
    B(int id, String name, String dept, String college){
        super(id, name, dept);
        this.college=college;
    }
    public void display(){
        System.out.println("COLLEGE : "+college);
    }
}
