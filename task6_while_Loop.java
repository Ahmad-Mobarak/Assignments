public class task6_while_Loop {
    public static void main(String[] args)
    {
        int i = 5;
        while(i >= 1) {
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}