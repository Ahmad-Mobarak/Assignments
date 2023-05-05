public class Task8_1 {
    public static void main(String[] args)
    {
        int[] myArray = {5, 10, 15, 20, 25};
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}