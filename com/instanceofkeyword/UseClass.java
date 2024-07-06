package com.instanceofkeyword;

public class UseClass {
}
class Vehicle extends UseClass{
    public static void main(String[] args) {
        UseClass use = new Vehicle();
        boolean resultclass = use instanceof Vehicle;
        System.out.println("The result is : " +resultclass);
    }
}
