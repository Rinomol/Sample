package com.oops.abstraction;

public class Mainclass {
    public static void main(String[] args) {
        Calculate cal=new Calculate();
        System.out.println("Add of two numbers:"+cal.addTwoNumber(2,3)+" "+"Add of three numbers:"+cal.addThreeNumber(3,4,5));

        cal.regularMethod();
    }
}
abstract class Add {
    abstract int addTwoNumber(int number1, int number2);
    abstract int addThreeNumber(int number1, int number2,int number3);
    public void regularMethod(){
        System.out.println("I am a regular method:");
    }
}
class Calculate extends Add {
    @Override
    int addTwoNumber(int number1, int number2)

    {
        return number1+number2;
    }
    int addThreeNumber(int number1, int number2,int number3 )
    {
        return number1+number2+number3;
    }
}