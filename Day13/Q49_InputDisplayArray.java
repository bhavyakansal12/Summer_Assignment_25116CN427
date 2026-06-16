package Day13;
import java.util.Scanner;

public class Q49_InputDisplayArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:"); 
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        System.out.print("The array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        inp.close();
    }
}