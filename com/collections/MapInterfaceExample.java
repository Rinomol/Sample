package com.collections;

import java.util.*;

public class MapInterfaceExample {
    public static void main(String[] args) {
//        mapinterface();
        MapInterfaceExample obj = new MapInterfaceExample();
        obj.hashMapClass();
//        obj.LinkedHashMap();
//        obj.treeMap();

    }
    private static void mapinterface(){
        Map studentDetails = new HashMap();
        studentDetails.put("Jagi","104");
        studentDetails.put("Rino","101");
        studentDetails.put("Danya","105");
        studentDetails.put("Jaya","102");
        studentDetails.put("Raj","107");
        studentDetails.put("Mary","109");
        studentDetails.put("sun","108");
        studentDetails.put("null",null); // allow null value

        System.out.println("Map Output:" + studentDetails);
        System.out.println("Entry set is:" + studentDetails.entrySet());
        System.out.println("Key set is:" + studentDetails.keySet());
        System.out.println("values  is:" + studentDetails.values());

    }

    private void hashMapClass(){
        HashMap<Integer, String> fruitslist = new HashMap<>();
        fruitslist.put(1,"Apple"); //key and  values are object
        fruitslist.put(2,"Orange");
        fruitslist.put(3,"Mango");
        fruitslist.put(null,"Papaya");//can store n number of null value, but only one in key, take last value
        fruitslist.put(null,"grapes");
        System.out.println(fruitslist);

        //putAll()
        HashMap<Integer, String> fruitsListOne = new HashMap<>();
        fruitsListOne.put(4,"Banana");
        fruitsListOne.put(5,"Kiwi");
        fruitslist.putAll(fruitsListOne);
        System.out.println("Add the element in another"+fruitslist);

        //iterating hashmap. Entry using for each loop

        for (HashMap.Entry<Integer,String> entryobj : fruitslist.entrySet())
            System.out.println("Key is " +entryobj.getKey() +", value is " +entryobj.getValue());
        System.out.println("................");
        // iterator while loop
        Iterator<Map.Entry<Integer,String>> itr = fruitslist.entrySet().iterator();
        while (itr.hasNext()){ // hashNext()--> check before and after, the element is or not
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println("Key is: " +entry.getKey() +", Value is: " +entry.getValue());
        }
    }

    private void LinkedHashMap(){
        LinkedHashMap<Integer,String> fruitslist = new LinkedHashMap<>();
        fruitslist.put(1,"Apple");  // key and value are object
        fruitslist.put(2,"Orange");
        fruitslist.put(3,"Mango");
        fruitslist.put(4,"Papaya");
        fruitslist.put(5,"Grapes");
        fruitslist.put(null,"Grapes"); // It may have one null key and multiple null values.
        fruitslist.put(null,"Potato"); // print last assign entries(key,value)
        fruitslist.put(6,null);        // duplicate null value are allow
        fruitslist.put(7,null);
        System.out.println(fruitslist); //insertion order

    }

    private void treeMap(){
        TreeMap<Integer,String> fruitslist = new TreeMap<>();
        fruitslist.put(1,"Apple"); // key and values are object
        fruitslist.put(2,"Orange");
        fruitslist.put(3,"Mango");
        fruitslist.put(4,"Papaya");
        fruitslist.put(5,"Grapes");
        fruitslist.put(5,"Grapes");
        fruitslist.put(5,"Potato");
        fruitslist.put(6,null);
        fruitslist.put(7,null);
        System.out.println(fruitslist);
        System.out.println();

    }

}
