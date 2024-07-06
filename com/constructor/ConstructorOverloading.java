package com.constructor;

public class ConstructorOverloading {
    private String personname;
    private int authernumber;
    private String voteidnumber;
    private boolean isEligible;
    ConstructorOverloading(String personname, String voteidnumber){
    this.personname = personname;
    this.voteidnumber = voteidnumber;
        System.out.println("Person name: " +personname +"\n" +"Person voteidnumber: " +voteidnumber);
    }
    ConstructorOverloading(String personname, int authernumber, String voteidnumber, boolean isEligible) {
        this.personname = personname;
        this.authernumber = authernumber;
        this.voteidnumber = voteidnumber;
        this.isEligible = isEligible;
        System.out.println("Person name: " +personname +"\n" +"Person authernumber: " +authernumber +"\n" +"Person voteidnumber: " +voteidnumber +"\n" +"Person eligible for vote: " +isEligible);
    }
    public static void main(String[] args) {
    new ConstructorOverloading("Rino", "ab47856");
    new ConstructorOverloading("Jagi", 46646576, "ar578876465", true);
    }
}
