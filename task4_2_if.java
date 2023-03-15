import java.util.Scanner;
public class task4_2_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("Invalid operator!");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}