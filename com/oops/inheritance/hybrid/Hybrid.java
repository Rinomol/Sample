package com.oops.inheritance.hybrid;

public class Hybrid {
    public static void main(String[] args) {
    ChildclassD cls =new ChildclassD();
    cls.devision();
    cls.display();
    cls.subtraction();
    cls.addition();
    }
}
interface BaseclassA {
    void addition();

}
interface BaseclassB extends BaseclassA{

    public  void subtraction();
}
interface BaseclassC extends BaseclassA{

    void devision();
}


class ChildclassD implements BaseclassB,BaseclassC{

    @Override
    public void addition() {
        int number1=30, number2=20;
        int result = number1 + number2;
        System.out.println("Addition is:" +result);
    }

    @Override
    public void subtraction() {
        int number1=30, number2=20;
        int result = number1 - number2;
        System.out.println("Subtraction is:" +result);
    }

    @Override
    public void devision() {
        int number1=30, number2=10;
        int result = number1/number2;
        System.out.println("Devision is :" +result);

    }
    void display(){
        System.out.println("Welcome ");
    }
}