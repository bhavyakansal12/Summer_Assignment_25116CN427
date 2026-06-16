package Day13;
import java.util.Scanner;

public class Q52_CountEvenOdd {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even elements: " + evenCount);
        System.out.println("Total odd elements: " + oddCount);

        inp.close();
    }
}