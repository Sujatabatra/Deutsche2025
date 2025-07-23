package com.sujata.demo;

import java.util.Scanner;

//Checked
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

class AgeInput{
    int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age)throws AgeException {
        if(age<18)
            throw new AgeException("Age can not be less than 18");
        this.age = age;
    }
}
public class ThrowDemoClass {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Age : ");
        int a=scanner.nextInt();

        AgeInput ageInput=new AgeInput();
        try {
            ageInput.setAge(a);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
