package com.javafeatures.functionalinterface;

public interface BusinessLogic{
    void sub(int a, int b);

}
class Subtraction{
    public static void main(String[] args) {
        BusinessLogic de2 = (a,b)->{
          if (a>b){
              throw new RuntimeException("Message");
          }
          else {
              System.out.println("Subtraction is : " +(a-b));
          }
        };
        de2.sub(6,10);
    }
}
