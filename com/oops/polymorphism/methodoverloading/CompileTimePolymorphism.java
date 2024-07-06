package com.oops.polymorphism.methodoverloading;
class Calculation {
    int number1;
    int number2;
    int number3;
    String name;

    public void addition(int number1, int number2) {
        this.number1 = number1;
        number1 = 5;
        this.number2 = number2;
        System.out.println("Addition of 2 number is:" + (number1 + number2));
    }

    public void addition(double number1, double number2, int number3) {
        this.number1 = (int) number1;
//Type casting means: Assign a one primitive datatype to another primitive datatype
        this.number2 = (int) number2;
        this.number3 = number3;
        System.out.println("Addition of 3 number is:" + (number1 + number2 + number3));
    }

    public String addition(int number1, String name) {
        this.number1 = number1;
        this.name = name;
        System.out.println("I am a number:" + (number1 + name));
        return number1 + name;
    }
//    public void addition(int number1, String name){
//        this.number1=number1;
//        this.name=name;
//        System.out.println("I am a number:" +(number1 + name));
//}
}
public class CompileTimePolymorphism
{
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        System.out.println("CompileTimePolymorphism example:");
        cal.addition(2,6);
        cal.addition(3.1,4.2,5);
        cal.addition(7,"element");
    }
}