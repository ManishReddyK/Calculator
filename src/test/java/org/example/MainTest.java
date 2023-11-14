package org.example;//package org.example;
//import org.example.Main.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.example.Functions.power;
import static org.example.Functions.squareRoot;
import static org.example.Functions.naturalLog;
import static org.example.Functions.factorial;


//import static org.example.Main.*;

public class MainTest{
    private Main Calc;

    @Before
    public void setUp() {
        Calc = new Main();    }

    @Test
    public void test_squareRoot() {
        double val = 16.0;
        double expectedResult = 4.0;
        double result = squareRoot(val);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
    @Test
    public void test_factorial() {
        int a = 5;
        int expectedResult = 120;
        int result = factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_naturalLog(){
        double a = 2.718;
        double expectedResult = 1.0;
        double result = naturalLog(a);
        Assert.assertEquals(expectedResult,result,0.2f);
    }

    @Test
    public void test_power(){
        double a = 2.0;
        double b = 5.0;
        double expectedResult = 32.0;
        double result = power(a,b);
        Assert.assertEquals(expectedResult,result,0.0f);
    }

}