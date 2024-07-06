package com.collections;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        SetInterface setinter = new SetInterface();
        setinter.hashSetClass();
        setinter.linkedHashSet();
        setinter.treeSet();

    }
    private void hashSetClass(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("10");
        hashSet.add("20");
        hashSet.add("30");
        hashSet.add("30");
        System.out.println("Objects are : " +hashSet);

        //add();
        Set<String> hashsetNew = new HashSet<String>();
        hashsetNew.add("40");
        hashsetNew.add("50");
        System.out.println("New objects are : " +hashsetNew);
        hashsetNew.addAll(hashSet);
        System.out.println("Added objects are : " +hashsetNew);

        //toArray()--->convert array to object
        Object[] objects = new Object[hashsetNew.size()];
        hashsetNew.toArray(objects);
        System.out.println("Array objcts are : ");
        for (Object item : objects){
            System.out.println(item +" ");
        }
        System.out.println();
    }
    private void linkedHashSet(){
        LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
        hashSet.add("10");
        hashSet.add("20");
        hashSet.add("30");
        hashSet.add("30");
        System.out.println("Objects are : " +hashSet);

        Set<String> hashsetNew = new HashSet<String>();
        hashsetNew.add("40");
        hashsetNew.add("50");
        System.out.println("New objects are : " +hashsetNew);

        hashsetNew.addAll(hashSet);
        System.out.println("Added objects are : " +hashsetNew);

        //iterator()
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterating elements : " +iterator.next());
        }
    }
    public void treeSet(){
        TreeSet hashset = new TreeSet();
        hashset.add("10");
        hashset.add("20");
        hashset.add("30");
        hashset.add("30");
        hashset.add("40");

        //classcastException -->if give integer whole values should in integer
//    hashset.add(null);//nullpointerexception

        System.out.println("Objects are : " +hashset);
    }

    /* private void stackExample(){
     Stack<String> studentlist = new Stack<>();
      studentlist.add(null);
      studentlist.add("Arun");
      studentlist.add("Asha");
      studentlist.add("Anu");
      studentlist.add("Hanna");
      //studentlist.pop();
     // studentlist.add(null);
      System.out.println(studentlist);
      studentlist.pop();
      studentlist.pop();
       studentlist.pop();
       studentlist.pop();
       studentlist.pop();
      System.out.println(studentlist.empty());
  }


   }
 */

}
