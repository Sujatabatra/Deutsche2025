package com.sujata.demo;

/*
Rules
Constructor is a method which gets called while instantiating the object.
 1. Constructor name is always same as that of your class name
 2. Constructor can be argumented as well as non argumented
 3. Constructor cannot return any value not even void
 4. Constructor can exist in any scope i.e public, private, protected, default
 5. if your class is constructor challenged,
  then compiler will create one zero argument constructor for that class.
  and that zero argument constructor is also know as default constructor
 */
public class Complex {


    private int real,imagenary;


    public Complex(int real,int imagenary){
        this.real=real;
        this.imagenary=imagenary;
    }
    private Complex(){
        real=1;
        imagenary=5;
    }
    Complex(int real){
        this.real=real;
        imagenary=1;
    }

    public int getReal() {
        return real;
    }

    public void setReal(/*local variable*/int real) {
        this.real = real;
    }

    public int getImagenary() {
        return imagenary;
    }

    public void setImagenary(int imagenary) {
        this.imagenary = imagenary;
    }
    public void display(){
        System.out.print(real);
        if(imagenary>0)
            System.out.println("+"+imagenary+"i");
        else if(imagenary<0)
            System.out.println(imagenary+"i");
    }

    public void addComplex(Complex complex1,Complex complex2){
        real=complex1.real+complex2.real;
        imagenary=complex1.imagenary+complex2.imagenary;
    }

    public Complex multiplyComplex(Complex complex2){
        Complex complex3=new Complex();
        complex3.real=real*complex2.real-imagenary*complex2.imagenary;
        complex3.imagenary=real*complex2.imagenary+imagenary*complex2.real;
        return complex3;
    }
}
