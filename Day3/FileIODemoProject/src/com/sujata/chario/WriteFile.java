package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("chario.txt");

            String str="Hello Everyone , How are you?\n Today is Rainy Day!";
            fileWriter.write(str);
            System.out.println("File Created!");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
