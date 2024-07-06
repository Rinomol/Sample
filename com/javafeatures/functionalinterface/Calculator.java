package com.javafeatures.functionalinterface;

public interface Calculator {
    void switchOn();
}
class CalUseFunInterface implements Calculator{

    @Override
    public void switchOn() {
        System.out.println("Switch is on");
    }

    public static void main(String[] args) {
        CalUseFunInterface cal = new CalUseFunInterface();
        cal.switchOn();
    }
}
