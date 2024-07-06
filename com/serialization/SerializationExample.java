package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeName = "Anitha";
        employee.employeeAddress = "Chennai";
        employee.employeeSalary = "40.5K";
        employee.employeeId = "A234";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Hey!\\Desktop\\hello\\world.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved.");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
class Employee implements Serializable{
    public String employeeName;
    public String employeeAddress;
    public String employeeSalary;
    public String employeeId;
}

