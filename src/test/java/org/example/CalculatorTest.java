package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
           assertEquals( 5, calculator.add( 2,3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void  testDivisionByZero(){
        assertThrows(ArithmeticException.class,() -> calculator.divide(10,0));
    }
}