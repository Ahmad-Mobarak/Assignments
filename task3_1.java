import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        int roundedRadius = (int) Math.round(radius);
        double area = 3.14 * roundedRadius * roundedRadius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}