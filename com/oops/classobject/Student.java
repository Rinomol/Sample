package com.oops.classobject;

public class Student {
    String studname;
    String studrollno;
    String studdept;

    public void studDetail(String studname,String studrollno,String studdept){
        this.studname=studname;
        this.studrollno=studrollno;
        this.studdept=studdept;
        System.out.println("Student name is:"+studname);
        System.out.println("Student rollno is:"+studrollno);
        System.out.println("student department is:"+studdept);
    }
    public String studDetail1(String studname,String studrollno,String studdept){
        this.studname=studname;
        this.studrollno=studrollno;
        this.studdept=studdept;
        System.out.println("Student name is:"+studname+"\n"+"Student rollno is:"+studrollno+"\n"+"Student department is:"+studdept);
        return studname+studrollno+studdept;
    }

}
class StudentMain{
    public static void main(String[] args) {
        Student stud=new Student();
        stud.studDetail("Jagi","32","Mech");
        stud.studDetail1("Rino","33","CSE");
    }
}