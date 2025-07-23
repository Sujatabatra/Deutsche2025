package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsDemoClass {

    public static void openFile(String fileName)throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(fileName);
        System.out.println("File "+fileName+" opened for reading");
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String fname=null;
        try {
            System.out.println("Enter File Name : ");
            fname=scanner.next();
            openFile(fname);
        }
        catch(FileNotFoundException ex){
            System.out.println("File "+fname+" does not exist");
        }
    }
}
