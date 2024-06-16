import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operation: ");
        String op = sc.next();
        double result = 0;

        if (op == "+") {
            result = num1 + num2;

        } else if (op == "-") {
            result = (num1 - num2);
        } else if (op == "*") {
            result = (num1 * num2);
        } else if (op == "/") {
            if (num2 != 0) {
                result = (num1 / num2);
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation. Please enter either +, -, * or /");
        }

        System.out.println("Result is: " + result);
        sc.close();

    }

}
