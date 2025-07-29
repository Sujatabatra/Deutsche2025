package com.sujata.demo;

import com.sujata.excep.NegativeNumberException;

public interface Calculate {


    int divide(int number1,int number2) throws NegativeNumberException;
}
