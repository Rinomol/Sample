package com.streamapi.methodofstream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("grapes");
        // normal method
//        for (String itemobj : list){
//            System.out.println(itemobj);
//        }
        //using stream
//        list.stream().forEach(t -> System.out.println(t));
        // map //
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"mango");
        map.put(4,"grapes");
        // directly through forEachMethod
//        map.forEach((key,value) -> System.out.println(key +":" +value));
//        // stream through iterate
//        map.entrySet().stream().forEach((obj -> System.out.println(obj)));
//        // internal structure of forEach method
        Consumer<String> consumer = (t -> System.out.println(t));
        for (String sobj : list){
           consumer.accept(sobj);
        }

    }
}
