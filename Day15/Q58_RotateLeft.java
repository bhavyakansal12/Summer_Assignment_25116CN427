package Day15;
import java.util.Scanner;

public class Q58_RotateLeft {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];
        System.out.println("enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        if (size > 1) {
            int first = numbers[0];
            for (int i = 1; i < size; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[size - 1] = first;
        }

        System.out.println("array after left rotation: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        inp.close();
    }
}