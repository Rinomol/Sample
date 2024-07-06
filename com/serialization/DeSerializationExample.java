package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Hey!\\Desktop\\hello\\world.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
//            objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        finally {
            System.out.println("Employee Details: ");
            System.out.println("Name of the employee: " +employee.employeeName);
            System.out.println("Name of the employee: " +employee.employeeAddress);
            System.out.println("Name of the employee: " +employee.employeeSalary);
            System.out.println("Name of the employee: " +employee.employeeId);
        }
    }
}
