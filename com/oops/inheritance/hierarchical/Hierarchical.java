package com.oops.inheritance.hierarchical;

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("Science student details:");
        ScienceDerivedClassOne science =new ScienceDerivedClassOne("1","Rino","200","198");
        science.scienceDetails();
        System.out.println(".................");
        System.out.println("Arts student details:");
        ArtsDerivedClassTwo arts =new ArtsDerivedClassTwo("2","Danya","199","200");
        arts.artsDetails();

    }
}
class StudentBaseClass{
    String rollnum;
    String name;
    StudentBaseClass(String rollnum,String name){
        this.rollnum=rollnum;
        this.name=name;
    }
    void studentDetails(){
        System.out.println("Student rollnum is:"+rollnum);
        System.out.println("Student name is:"+name);
    }
}
class ScienceDerivedClassOne extends StudentBaseClass{
    String physics;
    String chemistry;
    ScienceDerivedClassOne(String rollnum,String name,String physics,String chemistry){
        super(rollnum,name);
        this.physics=physics;
        this.chemistry=chemistry;
    }
    void scienceDetails(){
        super.studentDetails();
        System.out.println("Physics mark is:"+physics);
        System.out.println("Chemistry mark is:"+chemistry);
    }

}
class ArtsDerivedClassTwo extends StudentBaseClass{
    String history;
    String geography;
    ArtsDerivedClassTwo(String rollnum,String name,String history,String geography){
        super(rollnum,name);
        this.history=history;
        this.geography=geography;
    }
    void artsDetails(){
        super.studentDetails();
        System.out.println("History mark:"+history);
        System.out.println("Geogrephy mark:"+geography);
    }
}

