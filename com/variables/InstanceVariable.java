package com.variables;

public class InstanceVariable {
    public static void main(String[] args) {
//        new InstanceVariable(120,60);
        InstanceVariable instvar = new InstanceVariable(23,45);
//        instvar.newPrintWeight();
//        run();
        instvar.exmp(10,20);

    }
    int height;
    int weight;
    InstanceVariable(int height, int weight){
      this.weight=weight;
      this.height=height;
        System.out.println(height+" "+weight);
    }

    public static void run(){

        System.out.println("huff...puff");
    }
public void newPrintWeight(){

        System.out.println("New print weight is:"+weight);
}

public  void exmp( int height, int weight){

        this.height=height;
        this.weight=weight;
    int result = height * weight;
    System.out.println(result);
}
}
