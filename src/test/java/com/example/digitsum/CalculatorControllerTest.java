package com.example.digitsum;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    @Test
    void calculator() {
        CalculatorController test = new CalculatorController();
        assertEquals(10,test.calculator(1234));
    }

    @Test
    void calculator2() {
        CalculatorController test = new CalculatorController();
        assertEquals(4,test.calculator(1111));
    }
    @Test
    void initialUsage(){
        CalculatorController test = new CalculatorController();
        try{
        Field calc = CalculatorController.class.getDeclaredField("usage");
        calc.setAccessible(true);
        assertEquals(calc.get(test),0);
        }catch (Exception e){
        }
    }
    @Test
    void getUsage() {
        CalculatorController test = new CalculatorController();
        test.calculator(1234);
        test.calculator(1235);
        assertEquals(test.getUsage(),2);
    }
}