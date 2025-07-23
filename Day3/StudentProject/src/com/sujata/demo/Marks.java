package com.sujata.demo;

public class Marks extends Student {

    private int marks1,marks2,marks3;
    public Marks(){
     //implicit call to base class default constructor
        super(0,null);//explicit call to base class constructor
        System.out.println("Marks Constructor");
    }

    public Marks(int rollNumber,String name,int marks1, int marks2, int marks3) {
        //implicit call to base class default constructor
        super(rollNumber,name); //explicit call to base class constructor
        System.out.println("Marks Argument Constructor");
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void inputData(int rollNumber,String name,int marks1, int marks2, int marks3) {
        inputData(rollNumber,name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Marks 1 : "+marks1);
        System.out.println("Marks 2 : "+marks2);
        System.out.println("Marks 3 : "+marks3);
    }
}
