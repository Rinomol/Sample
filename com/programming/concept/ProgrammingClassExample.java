package com.programming.concept;

public class ProgrammingClassExample {
    public static void main(String[] args) {
//        ifExample();
//        ifElseExample();
//        elseIfExample();
//        switchExample();
//        nestedIfElse();
//        whileLoopExample();
//        doWhileExample();
//        forLoopExample();
//        breakstatementExample();
        continuestatement();

    }
    public static void ifExample(){
        int aValue = 12;
        int bValue = 25;
        int cValue = 26;
        if(aValue > bValue){
            System.out.println("aValue is greater");
        }
        if(bValue > cValue){
            System.out.println("bValue is greater");
        }
        if(cValue < aValue){
            System.out.println("cValue is greater");
        }
    }
    public static void ifElseExample(){
        int number = 5;
        if(number % 2 == 0){
            System.out.println("The given number is evan");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
public static void elseIfExample(){

        String browser = "chrome";
        if(browser == "safari")
        {
            System.out.println("Hello World");
        }
        else if (browser == "chrome"){
            System.out.println("Browser name is chrome");
        }
        else if (browser == "chrome"){
            System.out.println("Browser name is safari");
        }
        else{
            System.out.println("Nothing");
        }
}
public static void switchExample(){
        String name = "Rino";
        switch (name){
            case "Rino":
                System.out.println("My name is World");
                break;
            case "Home":
                System.out.println("My name is Home");
                break;
            case "India":
                System.out.println("My name is India");
                break;
            default:
                System.out.println("My name is Ravi");
        }
}
public static void nestedIfElse(){
        int number1=23,number2=12,number3=24;
        if(number1>number2){
            if(number3<number1){
                System.out.println("Number3 value is:"+ number3);
            }
            else{
                System.out.println("Statement false");
            }
        }
        else{
            System.out.println("Condition false for first is statement");
        }
}
public static void whileLoopExample(){
        int num=10;
        while(num>0){
            System.out.println("The value of number is:"+num);
            num--;
        }
}
public static void doWhileExample(){
        int num=10;
        do{
            num--;
            System.out.println(num);
            //update section
//            num--;
        }while(num>0);
}
public static void forLoopExample(){
//        for(int num=10; num>0; num--){
//            System.out.println(num);
//        }
    for(int num=0; num<10; num++){
        System.out.println(num);
    }
}
public static void breakstatementExample(){
        for(int i=1; i<10; i++){
            System.out.println(i);
                if(i==5)
                break ;
        }
//    for(int i=1; i<10; i++){
//        one:{
//            two:{
//                if(i==5)
//                    break one;
//                if (i==7)
//                    break two;
//            }System.out.println(i);
//        } System.out.println(i);
//    }
    }
public static void continuestatement(){
        for(int i=0; i<10; i++){
            if(i==5)
                continue;
            System.out.println(i);
        }
}

}


