package com.sujata.demo;

import com.sujata.excep.NegativeNumberException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateImplTestTwo {

    private Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate=new CalculateImpl();
    }

    @AfterEach
    void tearDown() {
        calculate=null;
    }

    @Test
    @DisplayName("divide 20 by 5")
    void t001() throws NegativeNumberException {
        assertEquals(4,calculate.divide(20,5));
    }

    @Test
    void t002() throws NegativeNumberException {
        assertThrows(ArithmeticException.class,()->calculate.divide(20,0));

    }

    @Test
    void t003() throws NegativeNumberException {
        assertThrows(NegativeNumberException.class,()->calculate.divide(-20,10));
    }

    @Test
    void t004() throws NegativeNumberException {
        assertThrows(NegativeNumberException.class,()->calculate.divide(20,-10));
    }

    @Test
    void t005() throws NegativeNumberException {
        assertThrows(NegativeNumberException.class,()->calculate.divide(-20,0));
    }


    @Test
    void t006() throws NegativeNumberException {
        assertEquals(0,calculate.divide(0,20));
    }
}