package com.sujata.oopDemo;

/*
1st decide data
2nd thought is what should be the accessibility of data to the outside world
 readable : getter
 modifiable : setter

 */
public class Factorial {
    /*
    number : modifiable
    factorial : readbale
     */
    private int number,factorial;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFactorial() {
        calculateFactorial();
        return factorial;
    }

    private void calculateFactorial(){
        factorial=1;
        while(number>1)
            factorial*=number--;
    }

}
