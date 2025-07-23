package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemoClass {

    public static void divide(int number1,int number2){
        int divide=0;
        try{
            divide=number1/number2;
            System.out.println("Good bye from try!");
            return ;
        }
        finally{
            System.out.println("Bye from Finally");
        }
//        System.out.println("Bye from divide method");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            System.out.println("Enter First Number : ");
            int number1 = scanner.nextInt();
            System.out.println("Enter Second Number : ");
            int number2 = scanner.nextInt();
            divide(number1, number2);
        }
        catch(ArithmeticException exception){
            System.out.println("Undefined");
        }
        catch(InputMismatchException exception){
            System.out.println("Invalid Input");
        }
        catch(Exception exception){
            System.out.println("Something went wrong!");

        }
    }
}
