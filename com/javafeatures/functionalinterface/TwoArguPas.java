package com.javafeatures.functionalinterface;

public interface TwoArguPas {
    void sum(int a, int b);
}
class Display{
    public static void main(String[] args) {
        TwoArguPas de = (a,b)->{
            System.out.println("Addition is : " +(a+b));
        };
        de.sum(3,6);
    }
}