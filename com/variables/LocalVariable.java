package com.variables;

public class LocalVariable {
    public static void main(String[] args) {
//        block();
//        addition(5,4);
//        new LocalVariable(5,6);
        just();
    }
    // block
    static int a = 10;
    static int b = 5;
    static void block(){
        int result = a+b;
        System.out.println("Result is:"+result);
    }

    //method
    public static void addition(int firstnumber,int secondnumber){
        int result = firstnumber + secondnumber;
        System.out.println(result);
    }

    public static void just(){
        int firstnumber=10;
        int secondnumber=20;
        int result = firstnumber + secondnumber;
        System.out.println(result);
    }

    // constructor
    LocalVariable(int firstnumber, int secondnumber){
        int result= firstnumber + secondnumber;
        System.out.println(result);
    }


}
