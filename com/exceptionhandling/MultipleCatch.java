package com.exceptionhandling;


//import com.exceptionhandling.uncheckedexception.ArithmeticException;

public class MultipleCatch {
    public static void main(String[] args) {
        String number[] = {"10", "20", "30p", "40"};
        try {
            int value = 0;
            for (int i = 0; i < 6; i++) {
                try {
                    value = value + Integer.parseInt(number[i]);
                    System.out.println(value);
                } catch (Exception ex) {
                    System.out.println(" Ex" + ex);
                }
            }
            System.out.println("I am after inner catch");
            value = value / (value - value);
        }
        catch (ArithmeticException e1){
            System.out.println("ArithmeticException" +e1.getMessage().toString());
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ArrayIndexOutOfBoundsException" + e2.getMessage().toString());
        }
        catch (NullPointerException e3){
            System.out.println("NullPointerException" +e3.getMessage().toString());
        }
        System.out.println("I am after catch");
    }
}
