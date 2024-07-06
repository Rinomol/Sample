package com.exceptionhandling;

import java.beans.Expression;

public class NestedTry {
    public static void main(String[] args) {
        try {
                try {
                System.out.println("Inside block 1");
                int b = 5/0;
                System.out.println(b);
            }
            catch (Exception e1){
                System.out.println(e1);
//                System.out.println("Welcome World");
            }
            try {
                System.out.println("Inside block 2");
                String s = null;
                s.length();
                System.out.println(s);
            }catch (Exception e2){
                System.out.println(e2);
//                System.out.println("Display ");
            }
            System.out.println("Just another statement");
        }
        catch (Exception e3){
            System.out.println(e3);
            System.out.println("Inside parent try catch block");
        }
        System.out.println("Next statement");
    }
}
