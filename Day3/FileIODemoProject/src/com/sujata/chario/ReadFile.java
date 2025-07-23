package com.sujata.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("chario.txt");
            int ch;
            while((ch=fileReader.read())!=-1){
                System.out.print((char)ch);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
