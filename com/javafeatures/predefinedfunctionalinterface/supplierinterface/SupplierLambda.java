package com.javafeatures.predefinedfunctionalinterface.supplierinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi";
        System.out.println(supplier.get());
        //......using list
        List<String> list = Arrays.asList("a","b","c");
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
