package com.sujata.demo;

import com.sujata.excep.NegativeNumberException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculateImplTestThree {

    private Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate=new CalculateImpl();
    }

    @AfterEach
    void tearDown() {
        calculate=null;
    }

    public static Stream<Arguments> values(){
        return Stream.of(
                Arguments.of(NegativeNumberException.class,-20,10),
                Arguments.of(NegativeNumberException.class,20,-10),
                Arguments.of(NegativeNumberException.class,-20,0),
                Arguments.of(ArithmeticException.class,20,0)
        );
    }
    @Test
    @DisplayName("divide 20 by 5")
    void t001() throws NegativeNumberException {
        assertEquals(4,calculate.divide(20,5));
    }

    @ParameterizedTest
    @MethodSource("values")
    void testForException(Class className,int number1,int number2) throws NegativeNumberException {
        assertThrows(className,()->calculate.divide(number1,number2));

    }


    @Test
    void t006() throws NegativeNumberException {
        assertEquals(0,calculate.divide(0,20));
    }
}