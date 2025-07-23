package com.sujata.com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {
    public static void main(String[] args){
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("person.txt");

            objectOutputStream=new ObjectOutputStream(fileOutputStream);

            Person person=new Person(101,"AAAA",56);

            objectOutputStream.writeObject(person);
            System.out.println("File Created");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
