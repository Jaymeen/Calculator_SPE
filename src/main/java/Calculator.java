/*class Operations {
    public double squareRoot(double num) {
        if(num < 0) {
            return -1;
        }
        return Math.sqrt(num);
    }

    public double logb10(double num) {
        if(num <= 0) {
            return -1;
        }
        return Math.log10(num);
    }

    public double logbe(double num) {
        if(num <= 0) {
            return -1;
        }
        return Math.log(num);
    }

    public long fact(int num) {
        if(num < 0) {
            return -1;
        }
        else if(num == 0) {
            return 1;
        }
        else {
            long fact = 1;
            for(int i = 1; i <= num; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Operations operations = new Operations();
        String

        System.out.println("Hello World !");
    }
}
*/

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void  printAns(double ans){
        System.out.println("************************************************");
        System.out.println("Your answer is " + ans);
        System.out.println("************************************************");
    }

    public static double squareRoot(double num){
        double ans = 0;
        try {
            logger.info("Let's calculate square root of " + num);
            if(num < 0){
                ans = Double.NaN;
                throw new ArithmeticException("Given Number is negative so can't find Square Root.");
            }else {
                ans = Math.sqrt(num);
            }
        }catch (ArithmeticException e){
            logger.error("Number should not be negative : " + e.getMessage());
        }finally {
            logger.info("Result : " + ans);
        }
        return ans;
    }

    public static double factorial(double num){
        double ans = 1;
        try {
            logger.info("Let's calculate factorial of " + num);
            if(num < 0){
                ans = Double.NaN;
                throw new ArithmeticException("Given Number is negative so can't find factorial.");
            }
            if(num != (int)num){
                ans = Double.NaN;
                throw new ArithmeticException("Given Number is factional so can't find factorial.");
            }
            else {
                for(int i=1; i<=num; i++){
                    ans = ans * i;
                }
            }
        }catch (ArithmeticException e){
            logger.error("Error : " + e.getMessage());
        }finally {
            logger.info("Result : " + ans);
        }
        return ans;
    }

    public static double naturalLog(double num){
        double ans = 0;
        try {
            logger.info("Let's calculate natural log of " + num);
            if(num <= 0){
                ans = Double.NaN;
                throw new ArithmeticException("Number should be > 0");
            }
            else {
                ans = Math.log(num);
            }
        }catch (ArithmeticException e){
            logger.error("Number should be positive only : " + e.getMessage());
        }finally {
            logger.info("Result : " + ans);
        }
        return ans;
    }

    public static double mypower(double num1, double num2){
        double ans = Double.NaN;
        try {
            logger.info("Let's calculate " + num1 + "to the power " + num2);
            ans = Math.pow(num1, num2);
        }catch (ArithmeticException e){
            logger.error("Error : " + e.getMessage());
        }finally {
            logger.info("Result : " + ans);
        }
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double ans, num;

        do {

            System.out.println("\n\nWelcome to Mini Calculator... \nChoose one of the Following operation.");
            System.out.println("Press 1 for Square Root");
            System.out.println("Press 2 for Factorial");
            System.out.println("Press 3 for Natural logarithm");
            System.out.println("Press 4 for Power function");
            System.out.println("Press 0 to Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Number");
                    num = sc.nextDouble();
                    ans = squareRoot(num);
                    printAns(ans);
                    break;

                case 2:
                    System.out.println("Enter the Number");
                    num = sc.nextDouble();
                    ans = factorial(num);
                    printAns(ans);
                    break;

                case 3:
                    System.out.println("Enter the Number");
                    num = sc.nextDouble();
                    ans = naturalLog(num);
                    printAns(ans);
                    break;

                case 4:
                    System.out.println("Enter the base number");
                    num = sc.nextDouble();
                    System.out.println("Enter the power number");
                    double power = sc.nextDouble();
                    ans = mypower(num, power);
                    printAns(ans);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Please choose correct option");
                    break;
            }

        }while(choice != 0);

    }
}

