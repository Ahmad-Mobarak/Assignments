public class task5_1_while_loop {
    public static void main(String[] args)
    {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers from 1 to 10: " + sum);
    }
}