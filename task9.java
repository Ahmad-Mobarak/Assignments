import java.util.Scanner;

public class task9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value for element [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
                sum += array[i][j];
            }
        }
        System.out.println("The contents of the array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}