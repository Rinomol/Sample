package com.javafeatures.functionalinterface;

public interface FunctionalInterfaceOne {
    public static void main(String[] args) {
        FunctionalInterfaceOne functionalInterfaceOne = new FunctionalInterfaceOne() {
            @Override
            public void methodOne() {
                System.out.println("Abstract method");
            }
            public void defaultMethodOne(){
                FunctionalInterfaceOne.super.defaultMethodOne();
            }
            public void defaultMethodTwo(){
                FunctionalInterfaceOne.super.defaultMethodTwo();
            }
        };
        functionalInterfaceOne.methodOne();
        functionalInterfaceOne.defaultMethodOne();
        functionalInterfaceOne.defaultMethodTwo();
        staticMethodOne();
        staticMethodTwo();
    }
    void methodOne();
    default void defaultMethodOne(){
        System.out.println("Default method one");
    }
    default void defaultMethodTwo(){
        System.out.println("Default Method Two");
    }
    static void staticMethodOne(){
        System.out.println("Statc method one");
    }
    static void staticMethodTwo(){
        System.out.println("Static method two");
    }
}
