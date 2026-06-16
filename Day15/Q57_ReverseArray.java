package Day15;
import java.util.Scanner;

public class Q57_ReverseArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];
        System.out.println("enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        int start = 0;
        int end = size - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        System.out.println("reversed array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        inp.close();
    }
}