public class Task5_1_for_Loop {
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to 10: " + sum);
    }
}