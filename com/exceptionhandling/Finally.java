package com.exceptionhandling;

public class Finally {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        try {
            a=10;
            b=10;
            System.out.println(" a " +a);
            System.out.println(" b " +b);
            c = a/(b-10);
            System.out.println("I am after exceptional statement");
        }
        catch (Exception e){
            System.out.println(e);
            c = a/b;
            System.out.println("I am in catch block");
        }
        finally {
            System.out.println("I am in finally block");
        }
        System.out.println(" c " +c);
    }
}
