package com.keyword;

public class ThisKeyword {
    public static void main(String[] args) {
        //new ThisKeyword(1,"Malar","Mar ephraem");
        ThisKeyword tis=new ThisKeyword();
        tis.display(2,"Ravi","Sun college");

    }
    int id;
    String name;
    String college;
//    ThisKeyword(int id, String name, String  college){
//        this.id=id;
//        this.name=name;
//        this.college=college;
//        System.out.println(id+"\n"+name+"\n"+college);
//    }
    public void display(int id, String name,String college){
        this.id=id;
        this.name=name;
        this.college=college;
        System.out.println(id+"\n"+name+"\n"+college);
    }
}
