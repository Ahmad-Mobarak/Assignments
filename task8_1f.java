import java.util.Scanner;

public class task8_1f {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        System.out.println("Please enter " + size + " integer numbers:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}