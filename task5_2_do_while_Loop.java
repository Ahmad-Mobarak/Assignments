public class task5_2_do_while_Loop {
    public static void main(String[] args)
    {
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i <= 10);
        System.out.println("Sum of odd numbers from 1 to 10: " + sum);
    }
}