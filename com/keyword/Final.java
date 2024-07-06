package com.keyword;


public class Final {
    public static void main(String[] args) {
        Final f = new Final();
        f.add(20);
    }
    final int x = 10;
    int y;

    public void add(int y) {
        this.y = y;
        int result = x + y;
        System.out.println(result);
    }
}
