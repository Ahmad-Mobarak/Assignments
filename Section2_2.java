import java.util.Scanner;
public class Section2_2
{public static void main(String args[]) {
    int a, b, result;
    final Scanner sc = new Scanner(System.in);
    System.out.print("Enter first digit ");
    a = sc.nextInt();
    System.out.println("Enter second digit ");
    b = sc.nextInt();
    System.out.println("Choose operation");
    System.out.println("Multiplication - 1 or Division - 2 or Adding - 3 or       aa  subtracting - 4");
    // int r;
    result = sc.nextInt();
    if (result == 1) {
        System.out.println(a * b);
    } else if (result == 2) {
        System.out.println(a / b);
    } else if (result == 3) {
        System.out.println(a + b);
    } else if (result == 4) {
        System.out.println(a - b);
    } else {
        System.out.println("incorrect digit");
    }
}
}