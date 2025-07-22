package com.sujata.training;

public class ReverseNumberClass {

    private int number,reverse;

    public ReverseNumberClass(int number){
        this.number=number;
    }

    public void calculateReverse(){
        int number1=number;
        while(number1>0){
            int remainder=number1%10;
            reverse=reverse*10+remainder;
            number1=number1/10;
        }
    }

    public void displayReverse(){
        System.out.println("Reverse of "+number+" = "+reverse);
    }
}
