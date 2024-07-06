package com.oops.inheritance.multilevel;

public class Multilevel {
    public static void main(String[] args) {
    ManagerDerivedClassTwo man=new ManagerDerivedClassTwo("101","Rino",5000);
    man.workerDetail();
    man.officerDetail();
    man.managerDetail();
    }
}

class WorkerBaseClass{
    String code;
    String name;
    long salary;
    WorkerBaseClass(String code,String name,long salary){
        this.code=code;
        this.name=name;
        this.salary=salary;
    }
    void workerDetail(){
        System.out.println("Code is:"+code);
        System.out.println("Name is:"+name);
        System.out.println("Salary is:"+salary);
    }
}
class OfficerDerivedClassOne extends WorkerBaseClass{
    long hra;
    OfficerDerivedClassOne(String code,String name,long salary){
    super(code,name,salary);
    this.hra=salary*60/100;
    }
    void officerDetail(){
        super.workerDetail();
        System.out.println("HRA is:"+hra);
    }
}

class ManagerDerivedClassTwo extends OfficerDerivedClassOne{
    long da;
    ManagerDerivedClassTwo(String code,String name,long salary){
        super(code,name,salary);
        this.da=salary*40/100;
    }
    void managerDetail(){
        super.officerDetail();
        System.out.println("DA is:"+da);
    }
}
