package Calculator;

import static java.lang.System.exit;
import java.util.*;
public class Calculator {
    private double ans;

    public void square_root(double x) {
        this.ans = Math.sqrt(x);
    }

    public void factorial(double x) {
        this.ans = 1;
        for (int i = 1; i <= x; i++) this.ans *= i;
    }

    public void loge(double x) {
        this.ans = Math.log(x);
    }

    public void power(double x, double y) {
        this.ans = Math.pow(x, y);
    }

    public double get_ans() {
        return this.ans;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int choice;
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- !! Calculator Operations !! ----------");
        while (true) {
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:  // For Square Root
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    c.square_root(x);
                    System.out.println("Square Root of " + x + " = " + c.get_ans());
                    System.out.println("------------------------------------------------");
                    break;

                case 2: // For Factorial
                    System.out.println("Factorial Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    c.factorial(x);
                    System.out.println("Factorial of " + x + " = " + c.get_ans());
                    System.out.println("------------------------------------------------");
                    break;
                case 3:  // For Natural Logarithm
                    System.out.println("Natural Logarithm Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    c.loge(x);
                    System.out.println("Natural Logarithm of " + x + " = " + c.get_ans());
                    System.out.println("------------------------------------------------");
                    break;
                case 4:  // For Power Function
                    System.out.println("Exponential Function:");
                    System.out.println("Enter the first number: ");
                    x = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    y = scanner.nextDouble();
                    c.power(x, y);
                    System.out.println("Power :" + x + "^" + y + " = " +c.get_ans());
                    System.out.println("------------------------------------------------");
                    break;

                case 5:
                    System.out.println("xxxxxxxxxxxxxxxxxxx Good Bye! xxxxxxxxxxxxxxxxxxx");
                    exit(0);
                default:
                    System.out.println("Invalid choice entered! Please choose from the options 1 to 5 given above.");

            }
            System.out.println("\n");
        }
    }
}