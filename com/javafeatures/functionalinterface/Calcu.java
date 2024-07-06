package com.javafeatures.functionalinterface;

public interface Calcu {
    void onSwitch();
}
class ImpFunCal{
    public static void main(String[] args) {
        Calcu ca = ()->{
            System.out.println("Switch is on");
        };  //we have only one statement print,no need to the curly braces
        ca.onSwitch();
    }
}