package com.rough;

import com.javafeatures.functionalinterface.Calculator;

public class Anu {
    public static void main(String[] args) {
        Calculator cal=()-> System.out.println("hello");
        cal.switchOn();
    }
}
