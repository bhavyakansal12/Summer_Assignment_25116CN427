package Day13;
import java.util.Scanner;

public class Q50_SumAvgArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        inp.close();
    }
}