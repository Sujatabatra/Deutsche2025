package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("byteio.txt");  //FileNotFoundException

            byte arr[]={'S','U','J','A','T','A','\n','D','B'};
            fileOutputStream.write(arr);  //Checked Exception IOException

            System.out.println("File Created");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
