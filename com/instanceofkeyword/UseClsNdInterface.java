package com.instanceofkeyword;

public class UseClsNdInterface {
    public static void main(String[] args) {
        Pizza pizza = new VegPizza();
        Pizza nonpizza = new NonVegPizza();
        test(pizza);
        test(nonpizza);
    }
    static void test(Pizza pizza){
        if (pizza instanceof VegPizza) {
            pizza.back();
        }
        if (pizza instanceof NonVegPizza){
            pizza.back();
        }
    }

}
interface Pizza{
    public void back();
}
class VegPizza implements Pizza{
    public void back(){
        System.out.println("Veg pizza");
    }
}
class NonVegPizza implements Pizza{
    public void back(){
        System.out.println("NonVegPizza");
    }
}
