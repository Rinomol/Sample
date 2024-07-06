package com.exceptionhandling.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) {
      createfile();
//      writeFile();
    }
    static void createfile(){
//        File file=new File("C:\\Users\\Hey!\\Desktop\\anu.txt");
//        File file=new File("D:\\disk d\\anu.txt");
        File file=new File("C:\\Anu\\sree.txt");
        try {
            if (file.createNewFile()){
                System.out.println("file is created:" +file.getName());
            }
            else {
                System.out.println("file already exist:");
            }
        }catch (IOException ex){
            System.out.println("An error occurs"+ex);
        }
    }
    static void writeFile(){
        String writeData = "Hello, Hi how are uuuu";
        try(FileWriter fileWriter = new FileWriter("D:\\disk d\\anu.txt")){
            fileWriter.write(writeData);
            System.out.println(writeData);

            System.out.println("write data successfully insert in step text file");
            fileWriter.append("\n How about");
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Error occured:"+e);
        }
    }
}
