package com.instanceofkeyword;

public class UsingVariable {
    public static void main(String[] args) {
        usingVariableChecking();

    }
    public static void usingVariableChecking(){
        String name="Hello";
        boolean result=name instanceof String;
        System.out.println("The result is : " +result);
        //variable value null means output is false
        String namenull=null;
        boolean resultnull=namenull instanceof String;
        System.out.println("The result is : " +resultnull);
    }
}
