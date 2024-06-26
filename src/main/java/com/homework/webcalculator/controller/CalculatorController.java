package com.homework.webcalculator.controller;

import com.homework.webcalculator.exeption.IllegalArgException;
import com.homework.webcalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String hello(){
        return "Добро";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1,
                       @RequestParam(required = false) Integer num2) {
        try {
            return calculatorService.plus(num1, num2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgException();
        }
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2){
        try {
            return calculatorService.minus(num1, num2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgException();
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2){
        try {
            return calculatorService.multiply(num1, num2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgException();
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2){
        try {
            return calculatorService.divide(num1, num2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgException();
        }
    }

}
