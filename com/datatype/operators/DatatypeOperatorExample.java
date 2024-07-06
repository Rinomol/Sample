package com.datatype.operators;

public class DatatypeOperatorExample {
    public static void main(String[] arg)
    {
//      datatype();
//      arithmaticOperation();
//      comparisionOperator();
//      assignmentOperator();
//      bitwiseOperator();
//      logicalOperator();
      conditionalOperators();
//      preincrementOperator();
//      postincrementOperator();
//      predecrementOperator();
//      postdecrementOperator();
    }

    public static void datatype()
    { 
        int a=10;
        long l=10000000;
        double d=10.4567;
        float f=10.45f;
        char c='a';
        String name="Rino";
        System.out.println("Integer value is :"+a);
        System.out.println("Long value is :"+l);
        System.out.println("double value is :"+d);
        System.out.println("float value is :"+f);
        System.out.println("Character value is :"+c);
        System.out.println("String value is :"+name);
    }

    public static void arithmaticOperation()
    {
        int number1=60,number2=7;
        System.out.println("Addition is:"+(number1+number2));
        System.out.println("Subtraction is:"+(number1-number2));
        System.out.println("Multification is:"+(number1*number2));
        System.out.println("Division is:"+(number1/number2));
        System.out.println("Modulus value is"+(number1%number2));
    }

    public static void comparisionOperator()
    {
        int number1=3,number2=5;
        System.out.println("greater:"+(number1>number2));
        System.out.println("lessor:"+(number1<number2));
        System.out.println("equal:"+(number1==number2));
        System.out.println("not equal:"+(number1!=number2));
        System.out.println("greator or equal:"+(number1>=number2));
        System.out.println("lessor or equal:"+(number1<=number2));
    }

    public static void assignmentOperator()
    {
        int number1=5,number2=4;
        int number3=number1+number2;
        System.out.println(number3);
        number3+=number1;//number3=number3+number1;9+5=14;
        System.out.println(number3);//14
        number2*=number3;//number2=number2*number3;4*14=
        System.out.println(number2);
        number1-=number2;//number1=number1-number2;5-56
        System.out.println(number1);
    }

    public static void bitwiseOperator()
    {
        int a=10,b=4;
        System.out.println(a&b);//&-AND
        System.out.println(a|b);//|-OR
        System.out.println(a^b);//^-XOR
        System.out.println(~a);//~-NOT
        System.out.println(a>>2);//>>-RightShift
        System.out.println(a<<2);//<<-LeftShift

    }

    public static void logicalOperator()
    {
        int a=10,b=4,c=9;
        System.out.println((a>b)&&(a<b));
        System.out.println((a>b)||(a<b));
        System.out.println(!((a>b)&&(a<b)));
        System.out.println((c<a)&&(a>b)||(a<b));
    }

    public static void conditionalOperators()
    {
        int a=10,b=4,c;
        c=((a>b)?a:b);
        System.out.println("c value is:"+c);
    }

    public static void preincrementOperator()
    {
        System.out.println("++preincrement");
        int a=5;
        System.out.println(a);//5
        System.out.println(++a);//6
        System.out.println(a);//6

    }

    public static void postincrementOperator()
    {
        System.out.println("postincrement++");
        int a=5;
        System.out.println(a);//5
        System.out.println(a++);//5
        System.out.println(a);//6

    }

    public static void predecrementOperator()
    {
        System.out.println("--predecrement");
        int a=5;
        System.out.println(a);//5
        System.out.println(--a);//4
        System.out.println(a);//4

    }

    public static void postdecrementOperator()
    {
        System.out.println("postdecrement--");
        int a=5;
        System.out.println(a);//5
        System.out.println(a--);//5
        System.out.println(a);//4

    }

}
