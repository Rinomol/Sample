package com.transientkeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        DeSerializationDemo deSerializationDemo = new DeSerializationDemo();
        deSerializationDemo.readEmployeeObject();

    }
    private void readEmployeeObject() throws IOException,ClassNotFoundException, FileNotFoundException{
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("anu.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println("Id is : " +employee.getId());
            System.out.println("Name is : " +employee.getName());
            System.out.println("Age is : " +employee.getAge());
            System.out.println("Successfully read.");
        }
        finally {
            if (objectInputStream != null){
                objectInputStream.close();
            }
        }
    }
}
