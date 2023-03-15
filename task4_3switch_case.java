import java.util.Scanner;
public class task4_3switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        switch(radius > 0 ? 1 : 0) {
            case 1:
                double area = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
                break;
            case 0:
                System.out.println("Invalid radius!");
                break;
        }
    }
}