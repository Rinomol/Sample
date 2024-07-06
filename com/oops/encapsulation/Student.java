package com.oops.encapsulation;

public class Student {
    private String studname;
    private int studrollno;
    private int studid;

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public int getStudrollno() {
        return studrollno;
    }

    public void setStudrollno(int studrollno) {
        this.studrollno = studrollno;
    }

    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }
}
class StudentMain{
    public static void main(String[] args) {
        Student stud=new Student();
        //call setter method & write the value of variable
        stud.setStudname("Jagi");
        stud.setStudrollno(32);
        stud.setStudid(1431);
        //call the getter method & read the value of variable print
//        System.out.println("Student name is:"+stud.getStudname()+"," +"Student rollno is:"+stud.getStudrollno()+"," +"Student id is:"+stud.getStudid());

        System.out.println("Student name is:"+stud.getStudname());
        System.out.println("Student rollno is:"+stud.getStudrollno());
        System.out.println("Student dept is:"+stud.getStudid());
    }
}