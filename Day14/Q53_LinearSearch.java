package Day14;
import java.util.Scanner;

public class Q53_LinearSearch {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        System.out.print("enter the element to search for: ");
        int target = inp.nextInt();

        int foundIndex = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found in the array.");
        }

        inp.close();
    }
}