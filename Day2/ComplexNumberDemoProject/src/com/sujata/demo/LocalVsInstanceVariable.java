package com.sujata.demo;

/*
Instance variable are initialised with default initial values,
whereas local variables are not
and if we try to use local variable without initialising them,
compiler will report us the error.
 */
class LocalVsInstanceVariableDemo {
    int value;

    void print(){
        System.out.println("value = "+value);
    }
}

public class LocalVsInstanceVariable{
    public static void main(String[] args) {
        LocalVsInstanceVariableDemo obj=new LocalVsInstanceVariableDemo();
        System.out.println(obj.value);

        int number;
//        System.out.println("Number : "+number);
    }
}
