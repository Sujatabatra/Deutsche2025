package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Toyota;

//Car Rental
public class Main {
    public static void main(String[] args) {
            Driver sonu=new Driver("Sonu");
            Driver ramesh=new Driver("Ramesh");

            BMW bmw=new BMW("X1","White");
            Audi audi=new Audi("Q3","Black");
            Toyota toyota=new Toyota("Altis","Golden");

            sonu.setCar(bmw);
            sonu.drive();

    }
}