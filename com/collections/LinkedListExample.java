package com.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedListExample linked =new LinkedListExample();
        linked.implementLinkedListClass();

    }
    public void implementLinkedListClass(){
        LinkedList<String> listone= new LinkedList<String>();
        listone.add(null);
        listone.add("Arun");
        listone.add("Asha");
        listone.add("Asha");
        listone.add("Hanna");
        listone.add(null);
        System.out.println(listone);

        //offer()---> used to element adds in the last position
        listone.offer("Ravi");  //automatic add at last
        System.out.println("Add the element in the last: " +listone);

        listone.offerFirst("John"); //add at first
        System.out.println("Add the element in the first: " +listone);

        listone.offerLast("Tamil"); //add at last
        System.out.println("Add the element in the last: " +listone);

        //peek()---> This method retrives the element but does not remove
        System.out.println("Using peek() : " +listone.peek());            //automatic show first element
        System.out.println("Using peekFirst() : " +listone.peekFirst());  //show first element
        System.out.println("Using peekLast() : " +listone.peekLast());    //show last element

        //poll()--->This method retrives and removes the list of elements
        System.out.println("Using poll() : " +listone.poll());
        System.out.println(listone);
        System.out.println("Using pollFirst() : " +listone.pollFirst());
        System.out.println(listone);
        System.out.println("Using pollLast() : " +listone.pollLast());
        System.out.println(listone);
        //Arraylist method are same as LinkedList


    }
}
