package com.oops.abstraction;

public class Abs {
    public static void main(String[] args)
    {
//        Mainclass main=new Mainclass();
//        System.out.println("Add of two numbers:"+main.addTwoNumber(2,3)+" "+"Add of three numbers:"+main.addThreeNumber(3,4,5));
//        main.regularMethod();

//        Addition add =new Addition();

        Calculation cal = new Calculation();
        cal.regularMethod();
        System.out.println("Add of 3 num is :" +cal.addThreeNumber(2,4,6));
        cal.addTwoNumber(4,5);
    }
}

abstract class Addition {
    abstract int addTwoNumber(int number1, int number2);
    abstract int addThreeNumber(int number1, int number2,int number3);
    public void regularMethod(){
        System.out.println("I am a regular method:");
    }}
class Calculation extends Addition {

    @Override
    int addTwoNumber(int number1, int number2) {
        System.out.println("Add os 2 num is : " +(number1+number2));
        return number1 + number2;
    }

    @Override
    int addThreeNumber(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
