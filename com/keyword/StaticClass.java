package com.keyword;

public class StaticClass {
    int id;
    String name = "Danya";
    static String college = "Mar Ephraem";
    static void display( ){
        System.out.println("College Name : "+college);
    }
        void print ( int id, String name){
            this.id = id;
            this.name = name;
            System.out.println("Id : " + id);
            System.out.println("Name : " + name);
            System.out.println("College :" +college);
        }
        public static void main (String[] args){
        display();
        StaticClass sta = new StaticClass();
        sta.print(2,"Ravi");
        }
    }
