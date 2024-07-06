package com.oops.inheritance.multiple;

public class Multiple {
    public static void main(String[] args) {
    Subtraction subt = new Subtraction();
    subt.mul(2,3);
    subt.add();
   subt.sub();
    }
}
interface Addition{
    void add();
}
interface Multiplication{
    int mul(int a, int b);
}
class Subtraction implements Addition,Multiplication{
    int a,b;

    @Override
    public void add() {
        a=10;
        b=10;
        int Result=a+b;
        System.out.println("Addition : " +Result);
    }

    @Override
    public int mul(int a, int b) {
      int result=a*b;
        System.out.println("Multiplication : "+result);
        return result;
    }
    public static void sub(){
        int a=8;
        int b=4;
        int result=a-b;
        System.out.println("Subtraction : " +result);
    }

}