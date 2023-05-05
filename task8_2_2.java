public class task8_2_2 {
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3, 5}, {4, 5, 6, 3}, {7, 8, 9, 2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];
                int fact = 1;
                for (int k = num; k >= 1; k--) {
                    fact *= k;
                }
                System.out.println("Factorial of " + num + " is: " + fact);
            }
        }
    }
}
