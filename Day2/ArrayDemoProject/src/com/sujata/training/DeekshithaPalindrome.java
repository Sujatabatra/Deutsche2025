package com.sujata.training;

public class DeekshithaPalindrome {
    private int number;
    private boolean palindrome;

    public DeekshithaPalindrome(int number){
        this.number=number;
    }

    public boolean isPalindorme(){
        ReverseNumberClass reverseNumberClass=new ReverseNumberClass(number);
        reverseNumberClass.calculateReverse();
        

    }

}
