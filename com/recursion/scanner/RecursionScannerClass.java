package com.recursion.scanner;
import java.util.Scanner;

public class RecursionScannerClass {

    public static void main(String[] args) {

//        infinitecallPrintHello();
//        finitecallPrintHello();
//        System.out.println(factorialMethod(5));
//        System.out.println(sum(10));

//        int result = sum(10);
//        System.out.println(result);

        scannerMethod();

    }


   static void infinitecallPrintHello(){
       System.out.println("hello");
       infinitecallPrintHello();
   }

   static int count = 0;
   static void finitecallPrintHello(){
//       count++;
       if(count <= 5)
       {
           count++;
           System.out.println("Hello" + count);
//           count++;
//           System.out.println(count);
           finitecallPrintHello();
       }

   }
   public static int factorialMethod(int number){
       if(number==1)
           return 1;
       else
           return (number*factorialMethod(number-1));//5*4*3*2*1
   }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
   }

   public static void scannerMethod(){
       Scanner scanner= new Scanner(System.in);

       System.out.println("Enter user name:");
       String name = scanner.nextLine();

       System.out.println("Enter user Email:");
       String email = scanner.nextLine();

       System.out.println("Enter user age:");
       int age = scanner.nextInt();

      // scanner.nextLine();

//       System.out.println("Enter user Email:");
//       String email = scanner.nextLine();



       System.out.println("user name is:"+name);
       System.out.println("User age is:"+age);
       System.out.println("User Email:"+email);
   }
}


/*Ex1:
    Write a program to input the principle, rate, time, calculate, simple interest and final amount
    formula: simpleinterest: (p*r*t)/100
             amount = simpleinterest + pricipel */

/*Ex2:
    Write a program to input the student name and obtained by five marks calculate average of mark */