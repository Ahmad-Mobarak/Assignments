public class task8_2 {
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3, 5}, {4, 5, 6, 3}, {7, 8, 9, 2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int factorial = 1;
                for (int k = 2; k <= arr[i][j]; k++) {
                    factorial *= k;
                }
                System.out.println("Factorial of " + arr[i][j] + " is " + factorial);
            }
        }
    }
}
