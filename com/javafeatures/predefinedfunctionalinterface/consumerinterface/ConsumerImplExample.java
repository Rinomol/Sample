package com.javafeatures.predefinedfunctionalinterface.consumerinterface;

import java.util.function.Consumer;

public class ConsumerImplExample implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("The value is : " +t);
    }
    public static void main(String[] args) {
//        ConsumerImplExample consumerExample = new ConsumerImplExample();
//        consumerExample.accept(10);

        Consumer<Integer> consumer = new ConsumerImplExample();
        consumer.accept(10);
    }
}
