package com.keyword.superexample;

public class MethodLevel {
    public static void main(String[] args) {
        DerivedClass d=new DerivedClass();
        d.showAll();
    }

    public void disply(){
        System.out.println("I am in first class");
    }
}
class DerivedClass extends MethodLevel{
    public void showAll(){
        super.disply();
        System.out.println("I am in second class");
    }
}
