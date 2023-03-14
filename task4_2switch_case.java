import java.util.Scanner;
public class task4_2switch_case {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}