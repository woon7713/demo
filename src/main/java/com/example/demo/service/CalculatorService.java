package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "divide":
                if(num2 == 0){
                    throw new IllegalArgumentException("Error: 0으로 나눌 수 없음");
                }
                return num1 / num2;
            case "multiply":
                return num1 * num2;
            default:
                throw new IllegalArgumentException("허용되지 않은 연산");
        }

    }


}
