package com.sujata.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateImplTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before Each!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each!");
    }

    @Test
    void divide() {
        System.out.println("Test Case 1 !");
    }

    @Test
    void divide1() {
        System.out.println("Test Case 2 !");
    }
}