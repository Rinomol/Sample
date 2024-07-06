package com.variables;

public class StaticVariable {
    public static void main(String[] args) {
    StaticVariable jagidel=new StaticVariable(1,"Jagi",5000);
    StaticVariable rinodel=new StaticVariable(2,"Rino",2000);
//    StaticVariable dandel=new StaticVariable(1,"Danya",500);
        jagidel.displayEmpDetails();
        rinodel.displayEmpDetails();
//        dandel.displayEmpDetails();

    }
    int id;
    String name;
    int salary;
    static String ceo="Jagi";

    StaticVariable(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.ceo=ceo;
//        id=id;
//       name=name;
//       salary=salary;
//       ceo=ceo;
//        System.out.println("Emp id is:"+id+";" +"Emp name is:"+name+";" +"Emp salary is:"+salary+";"+"CEO name is:"+ceo);

    }
    public void displayEmpDetails(){
//        System.out.println("Emp id is:"+this.id+";" +"Emp name is:"+this.name+";"+"Emp salary is:"+this.salary+";"+"CEO name is:"+this.ceo);

        System.out.println("Emp id is:"+id+";" +"Emp name is:"+name+";" +"Emp salary is:"+salary+";"+"CEO name is:"+ceo);

    }
}
