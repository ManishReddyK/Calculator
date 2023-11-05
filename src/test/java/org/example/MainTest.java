package org.example;//package org.example;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MainTest {
//
//    private Main testCalc;
//
//    @BeforeAll
//    public void setUp() { testCalc = new Main();    }
//
//    @AfterEach
//    public void tearDown() {
//    }
//
//    @Test
//    public void squareRoot() {
//    }
//
//    @Test
//    public void factorial() {
//    }
//
//    @Test
//    public void naturalLog() {
//    }
//
//    @Test
//    public void power() {
//    }
//
//    public Main getTestCalc() {
//        return testCalc;
//    }
//}


import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest{
    private Main uncalculator;

    @Before
    public void setUp() {
        uncalculator = new Main();
    }

    @Test
    public void test_squareRoot() {
        double val = 16.0;
        double expectedResult = 4.0;
        double result = uncalculator.squareRoot(val);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_factorial() {
        int a = 5;
        int expectedResult = 120;
        int result = uncalculator.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_naturalLog(){
        double a = 2.718;
        double expectedResult = 1.0;
        double result = uncalculator.naturalLog(a);
        Assert.assertEquals(expectedResult,result,0.2f);
    }

    @Test
    public void test_power(){
        double a = 2.0;
        double b = 5.0;
        double expectedResult = 32.0;
        double result = uncalculator.power(a,b);
        Assert.assertEquals(expectedResult,result,0.0f);
    }




}