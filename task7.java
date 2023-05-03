import java.util.Scanner;

public class task7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to store in the array?");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Please enter " + n + " integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        }
    }