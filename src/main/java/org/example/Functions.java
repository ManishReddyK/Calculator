package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Functions {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double squareRoot(double num) {
        double c = Math.sqrt(num);
        System.out.println();
        System.out.println("The Result is " + c);
        System.out.println();
        logger.info("Executing squareRoot function");
        return c;
    }
    public static int factorial(int num){
        int c = num;
        for(int i = num-1;i>=1;i--) c = c*i;
        System.out.println();
        System.out.println("The Result is " + c);
        System.out.println();
        logger.info("Executing factorial function");
        return c;
    }
    public static double naturalLog(double num){
        double c = Math.log(num);
        System.out.println();
        System.out.println("The Result is " + c);
        System.out.println();
        logger.info("Executing naturalLog function");
        return c;
    }
    public static double power(double num,double exp){
        double c = Math.pow(num,exp);
        System.out.println();
        System.out.println("The Result is " + c);
        System.out.println();
        logger.info("Executing power function");
        return c;
    }
}
