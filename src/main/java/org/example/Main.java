package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

import static org.example.Functions.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.print("-----Welcome to Calculator-------\n");
        logger.info("The world's first unscientific calculator. Now with many many Devop tools behind it!");
        Scanner reader = new Scanner(System.in);
        int op, flag = 0;
        double num, exp;
        int numm;
        
        do {
            System.out.println("--------------Calculator--------------");
            System.out.println("Choices of Operations: ");
            System.out.println();
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter your choice (number): ");
            System.out.println();
            op = reader.nextInt();
            if (op == 5) flag = 1;
            else {
                switch (op) {
                    case 1:
                        logger.info("Start of Execution");
                        System.out.println("You choose Square Root!");
                        System.out.println();
                        System.out.print("Enter Number: ");
                        num = reader.nextDouble();
                        squareRoot(num);
                        break;

                    case 2:
                        logger.info("Start of Execution");
                        System.out.println("You choose Factorial!");
                        System.out.println();
                        System.out.print("Enter Number: ");
                        numm = reader.nextInt();
                        factorial(numm);
                        break;

                    case 3:
                        logger.info("Start of Execution");
                        System.out.println("You choose natural Log!");
                        System.out.println();
                        System.out.print("Enter Number: ");
                        num = reader.nextDouble();
                        naturalLog(num);
                        break;

                    case 4:
                        logger.info("Start of Execution");
                        System.out.println("You choose Power!");
                        System.out.println();
                        System.out.print("Enter Number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        exp = reader.nextDouble();
                        power(num,exp);
                        break;
                        
                    default:
                        System.out.println("Exiting due to invalid input!!");
                        logger.warn("Invalid input");
                        flag = 1;
                }
            }
        } while (flag == 0);
    }
//    public static double squareRoot(double num) {
//        double c = Math.sqrt(num);
//        System.out.println();
//        System.out.println("The Result is " + c);
//        System.out.println();
//        logger.info("Executing squareRoot function");
//        return c;
//    }
//    public static int factorial(int num){
//        int c = num;
//        for(int i = num-1;i>=1;i--) c = c*i;
//        System.out.println();
//        System.out.println("The Result is " + c);
//        System.out.println();
//        logger.info("Executing factorial function");
//        return c;
//    }
//    public static double naturalLog(double num){
//        double c = Math.log(num);
//        System.out.println();
//        System.out.println("The Result is " + c);
//        System.out.println();
//        logger.info("Executing naturalLog function");
//        return c;
//    }
//    public static double power(double num,double exp){
//        double c = Math.pow(num,exp);
//        System.out.println();
//        System.out.println("The Result is " + c);
//        System.out.println();
//        logger.info("Executing power function");
//        return c;
//    }
}
