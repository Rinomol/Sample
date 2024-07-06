package com.javafeatures.predefinedfunctionalinterface.supplierinterface;

import java.util.function.Supplier;

public class SupplierImp implements Supplier<String> {

    @Override
    public String get() {
        return "Hi, how are you";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierImp();
        System.out.println(supplier.get());
    }
}
