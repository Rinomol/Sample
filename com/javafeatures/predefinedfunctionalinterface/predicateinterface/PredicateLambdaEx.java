package com.javafeatures.predefinedfunctionalinterface.predicateinterface;

import java.util.function.Predicate;

public class PredicateLambdaEx {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> {
          if (t%2 == 0){
              System.out.println("The number is evan");
              return true;
          }
          else {
              System.out.println("The number is odd");
              return false;
          }
        };
        System.out.println(predicate.test(10));
    }
}
