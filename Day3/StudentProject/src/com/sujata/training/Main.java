package com.sujata.training;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import com.sujata.demo.Marks;
import com.sujata.demo.Student;

public class Main {
    public static void main(String[] args) {

        //Dynamic Method Dispatch
        /*
        BaseClass reference variable is type compatible with DerivedClass Object
        BaseClass refVar=new DerivedClassConstructor(); //Possible

        but reverse is not true
        DerivedClass redVar=new BaseClassConstructor(); //Not Possible
         */

        Student student;

        student=new Marks(1,"AAAA",70,80,90);
        student.display();

        student=new Student(5,"EEEEE");
        student.display();

        //=============================================================================

        //        Student student=new Student(10,"AAA");
//        student.display();

//        Marks marks=new Marks(11,22,33);
//        marks.setRollNumber(1);
//        marks.setName("BBBB");
//        marks.setMarks1(60);
//        marks.setMarks2(80);
//        marks.setMarks3(90);
//        marks.display();
    }
}