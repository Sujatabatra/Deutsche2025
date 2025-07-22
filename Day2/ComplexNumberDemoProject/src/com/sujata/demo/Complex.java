package com.sujata.demo;

//POJO : Pain Old Java Object
public class Complex {

    //instance variable
    private int real,imagenary;

    public int getReal() {
        return real;
    }

    public void setReal(/*local variable*/int real) {
        //instance variable=local variable
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
