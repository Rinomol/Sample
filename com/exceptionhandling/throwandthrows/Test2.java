package com.exceptionhandling.throwandthrows;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your roll number: ");
        int roll = s.nextInt();
        try {
            if (roll < 0){
                throw new Exception("The number entered is not positive");
//                System.out.println("not valid");
            }
            else {
                System.out.println("valid roll number");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("An exception is thrown");
            System.out.println(e.getMessage());
        }
    }
}
