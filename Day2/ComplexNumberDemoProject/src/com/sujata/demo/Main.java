package com.sujata.demo;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Complex complex1=new Complex();
        complex1.setReal(5);
        complex1.setImagenary(9);

        Complex complex2=new Complex();
        complex2.setReal(8);
        complex2.setImagenary(-7);

        complex1.display();
        complex2.display();

        Complex complex3=new Complex();
        complex3.addComplex(complex1,complex2);
        System.out.print("Addition : ");
        complex3.display();

//        complex3=complex1.multiplyComplex(complex2);
//        complex3.display();
        }
    }
