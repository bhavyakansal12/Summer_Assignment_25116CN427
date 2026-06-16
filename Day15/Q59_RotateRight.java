package Day15;
import java.util.Scanner;

public class Q59_RotateRight {
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
            int last = numbers[size - 1];
            for (int i = size - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = last;
        }

        System.out.println("array after right rotation: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        inp.close();
    }
}