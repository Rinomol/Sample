package com.javafeatures.predefinedfunctionalinterface.predicateinterface;

import java.util.function.Predicate;

public class PredicateImp implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        if (t%2 == 0){
            System.out.println("The number is evan");
            return true;
        }else {
            System.out.println("The number is odd");
            return false;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateImp();
        System.out.println(predicate.test(10));
    }
}
