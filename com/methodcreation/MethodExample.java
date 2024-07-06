package com.methodcreation;

public class MethodExample {

    public static void main(String[] args) {
//        MethodExample methodExample=new MethodExample();
//        methodExample.printMethod();
      // new MethodExample();
//        printMethodOne();
        //printMethodTwo();
        addition(10,30);
//        additionOne();

    }

    public void printMethod()
    {
        String name="Rino";
        System.out.println("My name is "+name);
    }

    MethodExample()
    {
        String name="Anushek";
        System.out.println("My name is "+name);
    }

    public static void printMethodOne()
    {
        String name="Juliya";
        System.out.println("My name is "+name);
    }
    public static String printMethodTwo()
    {
        String name="Rino";
        System.out.println("My name is "+name);
        return name;
    }
    public static int addition(int number1,int number2)
    {
       int result=number1+number2;
       System.out.println("Addition of two numbers:"+(number1+number2));
       return result;

    }
    public static int additionOne()
    {
        int number1=20,number2=30;
        int result=number1+number2;
        System.out.println("Addition of two numbers:" +result);
        return result;

    }

}
