package com.javafeatures.predefinedfunctionalinterface.predicateinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilter {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t%2 == 0;
        System.out.println(predicate.test(4));

        List<Integer> listone = Arrays.asList(1,2,3,4,5);
        listone.stream().filter(predicate).forEach(t-> System.out.println("Print the number is : " +t));
    }
}
