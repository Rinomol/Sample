package com.constructor;

public class DefaultConstructor {
    String empName;
    String empAge;
    String empSalary;
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAge() {
        return empAge;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }
    static void normalMethod(){
        System.out.println("\nThis is normal method \n");
    }
//Note: \n line break
    public static void main(String[] args) {
        normalMethod();
DefaultConstructor defcons = new DefaultConstructor();
defcons.setEmpName("Jagi");
defcons.setEmpAge("26");
defcons.setEmpSalary("20000");
        System.out.println("Employee name : " +defcons.getEmpName());
        System.out.println("Employee age : " +defcons.getEmpAge());
        System.out.println("Employee salary : " +defcons.getEmpSalary());
    }
}
