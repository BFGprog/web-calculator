package com.homework.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        double result = num1 / (double) num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
