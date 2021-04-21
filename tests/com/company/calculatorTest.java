package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    private calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new calculator(10,2);
    }

    @Test
    void setValueOne() {
    }

    @Test
    void setValueTwo() {
    }

    @Test
    void add() {
        double expResult = 12;
        assertEquals(expResult, calculator.add());
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void devide() {
    }
}