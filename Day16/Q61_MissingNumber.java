package Day16;
import java.util.Scanner;

public class Q61_MissingNumber {
    public static void main(String[] args) {

       
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int expectedSum = (n + 1) * (n + 2) / 2;

        int actualSum = 0;
        for(int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);
        inp.close();
    }
}