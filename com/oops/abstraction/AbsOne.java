package com.oops.abstraction;

public abstract class AbsOne {
    abstract int addTwoNumber(int number1, int number2);
    abstract int addThreeNumber(int number1, int number2,int number3);
    public void regularMethod(){
        System.out.println("I am a regular method:");
    }}
class Claculation extends AbsOne{

    @Override
    int addTwoNumber(int number1, int number2) {
        return number1+number2;
    }

    @Override
    int addThreeNumber(int number1, int number2, int number3) {
        return number1+number2+number3;
    }}



class Maincla extends Claculation
{
    public static void main(String[] args)
    {
        Maincla main=new Maincla();
        System.out.println("Add of two numbers:"+main.addTwoNumber(2,3)+" "+"Add of three numbers:"+main.addThreeNumber(3,4,5));
        main.regularMethod();
    }
}
