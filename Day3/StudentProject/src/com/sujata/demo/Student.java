package com.sujata.demo;
//POJO : Plain Old Java Object
public class Student {
    private int rollNumber;
    private String name;

//    public Student(){
//        System.out.println("Student Constructor");
//    }
    public Student(int rollNumber, String name) {
       System.out.println("Student Argument Constructor");
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void  inputData(int rollNumber, String name) {
        System.out.println("Student Argument Constructor");
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Name : "+name);
    }
}
