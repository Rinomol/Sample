package com.javafeatures.predefinedfunctionalinterface.consumerinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambdaExample {
    public static void main(String[] args) {
//        Consumer<Integer>consumer = t-> System.out.println("The value of T is : " +t);
//        consumer.accept(10);
        //........create  a list using forEach method{forEach is a consumer interface}
        List<String> fruitlist = Arrays.asList("apple","mango","banana","orange");
        fruitlist.stream().forEach(t-> System.out.println("The fruitlists are : " +fruitlist));
    }
}
