package com.sujata.batra;

import com.sujata.demo.FirstClass;
import com.sujata.demo.SecondClass;

public class Main {
    public static void main(String[] args) {
        //different class different package
        SecondClass secondClass=new SecondClass();
        secondClass.thirdMethod();

        FirstClass firstClass=new FirstClass();

        com.sujata.training.FirstClass firstClass1=new com.sujata.training.FirstClass();
        

    }
    }
}