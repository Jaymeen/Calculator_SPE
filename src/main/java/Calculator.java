import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;

class Operations {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double squareRoot(double num) {
        double result = 0.0;

        try {
            logger.info("Calculating Square Root of : " + num);
            if(num < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Cannot Calculate Square Root for a value < 0");
            }
            else {
                result = Math.sqrt(num);
            }
        }
        catch (ArithmeticException arithmeticException) {
            logger.error("Invalid Argument Passed : " + arithmeticException.getMessage());
        }
        finally {
            logger.info("Output : " + result);
        }

        return result;
    }

    public double logbe(double num) {
        double result = 0.0;

        try {
            logger.info("Calculating Natural Log of : " + num);
            if(num <= 0) {
                result = Double.NaN;
                throw new ArithmeticException("Cannot Calculate Log for a value <= 0");
            }
            else {
                result = Math.log(num);
            }
        }
        catch(ArithmeticException arithmeticException) {
            logger.error("Invalid Argument Passed : " + arithmeticException.getMessage());
        }
        finally {
            logger.info("Output : " + result);
        }

        return result;
    }

    public long fact(int num) {
        long result = 1;

        try {
            logger.info("Calculating Factorial of : " + num);
            if(num < 0) {
                result = -1;
                throw new ArithmeticException("Cannot Calculate Factorial for a value < 0");
            }
            else if(num == 0) {
                return 1;
            }
            else {
                for(int i = 1; i <= num; i++) {
                    result *= i;
                }
            }
        }
        catch(ArithmeticException arithmeticException) {
            logger.error("Invalid Argument Passed : " + arithmeticException.getMessage());
        }
        finally {
            logger.info("Ouptut : " + result);
        }

        return result;
    }

    public double power(double base, double exponent){
        double result = 0.0;
        try {
            logger.info("Calculating " + base + " to the power " + exponent);
            result = Math.pow(base, exponent);
        }
        catch(ArithmeticException arithmeticException) {
            logger.error("Invalid Argument Passed : " + arithmeticException.getMessage());
        }
        finally {
            logger.info("Outupt : " + result);
        }

        return result;
    }
}

class Print {
    public void printResult(double result) {
        System.out.println("************************************************");
        System.out.println("Output : " + result);
        System.out.println("************************************************");
    }

    public void printResult(long result) {
        System.out.println("************************************************");
        System.out.println("Output : " + result);
        System.out.println("************************************************");
    }
}

public class Calculator {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Print print = new Print();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Calculate Square Root");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Calculate Natural logarithm");
            System.out.println("4. Calculate for Power function");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch(choice) {
                case 1: {
                    System.out.print("\nEnter your input : ");
                    double num = input.nextDouble();
                    double result = operations.squareRoot(num);
                    print.printResult(result);
                }
                break;

                case 2: {
                    System.out.print("\nEnter your input : ");
                    int num = input.nextInt();
                    long result = operations.fact(num);
                    print.printResult(result);
                }
                break;

                case 3: {
                    System.out.print("\nEnter your input : ");
                    double num = input.nextDouble();
                    double result = operations.logbe(num);
                    print.printResult(result);
                }
                break;

                case 4: {
                    System.out.print("\nEnter your base input : ");
                    double base = input.nextDouble();
                    System.out.print("\nEnter your exponential input : ");
                    double exponent = input.nextDouble();
                    double result = operations.power(base, exponent);
                    print.printResult(result);
                }
                break;

                default: {
                    System.out.println("\nPlease enter a valid input.");
                    break;
                }
            }

        }while(choice != 0);
    }
}

/*
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void  printAns(double result){
        System.out.println("************************************************");
        System.out.println("Output : " + result);
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
            System.out.println("1. Calculate Square Root");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Calculate Natural logarithm");
            System.out.println("4. Calculate for Power function");
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
*/
