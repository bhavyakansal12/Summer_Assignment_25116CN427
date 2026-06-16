package Day13;
import java.util.Scanner;

public class Q51_MinMaxArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);

        inp.close();
    }
}