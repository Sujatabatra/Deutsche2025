package com.sujata.demo;

import com.sujata.excep.NegativeNumberException;

public class CalculateImpl implements Calculate {

    /*
    performing on positive integers,
    if we came across with negative integers,
    NegativeNumberException will be thrown
     */


    @Override
    public int divide(int number1, int number2)throws NegativeNumberException {
        if(number1>=0 && number2 >=0 )
            return number1/number2;
        else
            throw new NegativeNumberException("Only Positive Integers accepted");
    }
}
