package com.keyword.superexample;

public class ConstructorLevel {
    public void show(){
        System.out.println("I am in first class");
    }

    public static void main(String[] args) {
        new ChildClass();

    }
}
class ChildClass extends ConstructorLevel{
    ChildClass(){
        super.show();
        System.out.println("I am in second class");
    }
}
