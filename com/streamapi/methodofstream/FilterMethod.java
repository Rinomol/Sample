package com.streamapi.methodofstream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("anju");
        list.add("orange");
        list.add("banana");
        // normal method
//        for (String itemobj : list){
//            if (itemobj.startsWith("a")){
//                System.out.println(itemobj);
//            }
//        }
        // stream method using map
        list.stream().filter(t -> t.startsWith("a")).forEach((t -> System.out.println(t)));
        // stream method using map
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.entrySet().stream().filter(k -> k.getKey()%2==0).forEach(obj -> System.out.println(obj));

    }
}
