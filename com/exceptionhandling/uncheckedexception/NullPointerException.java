package com.exceptionhandling.uncheckedexception;

public class NullPointerException {
    public static void main(String[] args) {
        try{
            String s = null;
            s.length();
            System.out.println(s);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("ERROR");
        }
    }
}
