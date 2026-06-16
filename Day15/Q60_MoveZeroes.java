package Day15;
import java.util.Scanner;

public class Q60_MoveZeroes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];
        System.out.println("enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                numbers[count] = numbers[i];
                count++;
            }
        }

        while (count < size) {
            numbers[count] = 0;
            count++;
        }

        System.out.println("array after moving zeroes: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        inp.close();
    }
}