package com.javafeatures.functionalinterface;

public interface OneArguPas {
    void show(String input);
}
class OneArg{
    public static void main(String[] args) {
        OneArguPas one = (input)->
                System.out.println("Hello" + " " +input);
        one.show("Ravi");
    }
}
