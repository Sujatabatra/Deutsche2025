package com.sujata.demo;

import java.util.Scanner;

public class FirstArrayDemoClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int arr[];
        System.out.println("Enter Total Number of elements : ");
        int total=scanner.nextInt();

        arr=new int[total];

        for(int index=0;index<total;index++){
            System.out.println("Enter element : ");
            arr[index]=scanner.nextInt();
        }

        for(int element:arr){
            System.out.println(element);
        }
    }
}
