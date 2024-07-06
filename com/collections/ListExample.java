package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        implementArrayListClass();

    }
    private static void implementArrayListClass(){
        ArrayList<String> studentlist = new ArrayList<String>();
        studentlist.add(null);
        studentlist.add("Arun");
        studentlist.add("Asha");
        studentlist.add("anu");
        studentlist.add("Hanna");
        studentlist.add(null);
        System.out.println(studentlist);

        //another list creation

        List<String> studentlistone = new ArrayList<String>();
        studentlistone.add("Jagi");
        studentlistone.add("Rino");
        studentlistone.add("Jagirino");
        studentlistone.add("Jagu");
        System.out.println(studentlistone);

        //addAll()---> It add the elements
        studentlist.addAll(studentlistone);
        System.out.println(studentlist);

        // get()---> get the value from gived index position
        System.out.println(studentlist.get(3));

        //set()---> set the replaced values
        System.out.println(studentlist.set(2,"Meena"));
        System.out.println(studentlist);

        //size()---> returns the length of the list
        System.out.println(studentlist.size());

        // toArray()--->toArray() convert a list into an array
        //                        Create a new array of String type
        //                        size of array is same as the ArrayList
        String[] arr = new String[studentlistone.size()];
        // Convert ArrayList into an array
        studentlistone.toArray(arr);
        // print all elements of the array
        System.out.print("Array are : ");
        //for each loop syntax....for(data type item:array)
        for (String item : arr){
            System.out.print(item +",");
        }
        System.out.println();

        //contains() used to checking if the specified element is exist in the given list or not
        System.out.println("contains method ");
        if (studentlistone.contains("Jagi")){
            System.out.println("Jagi present in list");
        } else if (studentlistone.contains("Ammu")) {
            System.out.println("Not present in studentlistone");
        }else {
            System.out.println("Jagi is not present in list");
        }

        //iterator()used to retriving object one by one from collection.
        //it is a forwared direction,not backword direction
        Iterator<String> iter = studentlistone.iterator();
        while (iter.hasNext())
            {//hasNext() used toThe next() method helps us to
                // find the last element of the List. It checks if the List has the next element or not.
                // If the hasNext() method gets the element during traversing in the forward direction,
                // returns true, else returns false and terminate the execution.
                System.out.print(iter.next() +" ");
                //The next() method perform the iteration
                // in forward order. It returns the next element in the List
            }
            System.out.println();

        //clone() used for copy the list(return to the object so typecasting is used)
        ArrayList studentlistthree = (ArrayList) studentlist.clone();   
        System.out.println("Cloned object : " +studentlistthree);
        //remove method()
        String removestring = studentlistone.remove(1);
        System.out.println("Remove the elements : " +removestring);
        studentlist.removeAll(studentlist);
        System.out.println("Remove all the elements : " +studentlist);
        //subList()
        System.out.println("sublist" +studentlistone.subList(0,3));

    }
}
