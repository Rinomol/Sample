package com.transientkeyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException{
        SerializationDemo serializationDemo = new SerializationDemo();
        serializationDemo.writeEmployeeObject();

    }
    public void writeEmployeeObject() throws FileNotFoundException, IOException{
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("anu.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Employee employee = new Employee(101,"Aaliya",23);
            System.out.println("Id is : " + employee.getId());
            System.out.println("Name is : " + employee.getName());
            System.out.println("Age is : " + employee.getAge());
            objectOutputStream.writeObject(employee);
            System.out.println("Successfully written");
        }
        finally {
            if (objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
}
