package com.sujata.oopDemo;

public class MainFactorial {
    public static void main(String[] args) {
        //Step 1
        Factorial factorial;
        //Step 2
        factorial=new Factorial();
        factorial.setNumber(4);
        System.out.println("Factorial : "+factorial.getFactorial());
    }
}
