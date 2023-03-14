import java.util.Scanner;
public class task4_3_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        if(radius > 0) {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is " + area);
        } else {
            System.out.println("Invalid radius!");
        }
    }
}