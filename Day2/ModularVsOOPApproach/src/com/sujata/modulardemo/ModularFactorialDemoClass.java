package com.sujata.modulardemo; //package statement

//class
public class ModularFactorialDemoClass {
    //ignore static as we are portraying Modular Approach
    static int number,factorial;  //Data
    //Syntax : Correct, Logic :Correct
    static void input(int n){
        number=n;
    }
    //Syntax : Correct, Logic :Correct
    static void displayResult(){
        System.out.println("Factorial : "+factorial);
    }
    //Syntax : Correct, Logic :Correct
    static void calculateFactorial(){
        factorial=1;
        while(number>1){
            factorial*=number--;
        }
    }
    //Syntax : Correct, Logic :InCorrect
    public static void main(String args[]){
        input(4);
        calculateFactorial();
        factorial=8; //logical error
        displayResult();
    }

}
