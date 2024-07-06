package com.rough;

public class NaturalNumSum {
    public static void main(String[] args) {
//       int result= sum(10);
//        System.out.println(result);
//        add();
//        multiple();
        odd();
    }
    public static int sum(int i){
        if(i>0)
        {
            return i+sum(i-1);
        }else {
            return 0;
        }
    }
    static void add(){
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum=sum + i;    //sum=0+1=1; sum=1+2=3; sum=3+3=6
        }
        System.out.println("Sum of 10 natural number is:"+sum);
    }
    static void multiple(){
        int num ;
        for(int i=1;i<=10;i++){
          num = i*5;
            System.out.println(num);
        }
    }
    static void odd(){

//        for(int i=1;i<=10;i++) {
//            if (i % 2 != 0)
//                System.out.println(i);

            for(int i=0;i<=10; i=i+2)
                System.out.println(i);
        }
    }

