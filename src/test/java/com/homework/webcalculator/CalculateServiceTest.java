package com.homework.webcalculator;

import com.homework.webcalculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceTest {

    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void plus(){
    String actual = "10 + 5 = 15";
    String expected = calculatorService.plus(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void minus(){
        String actual = "10 - 5 = 5";
        String expected = calculatorService.minus(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void multiply(){
        String actual = "10 * 5 = 50";
        String expected = calculatorService.multiply(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void divide(){
        String actual = "10 / 5 = 2.0";
        String expected = calculatorService.divide(10, 5);
        assertEquals(expected, actual);
    }


    @Test
    public void divideByZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(10, 0));
    }

    @Test
    public void minusException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.minus(10, null));
    }

    @Test
    public void multiplyException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.multiply(10, null));
    }

    @Test
    public void divideException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(10, null));
    }



}
