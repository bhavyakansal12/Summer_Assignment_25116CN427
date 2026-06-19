package Day16;
import java.util.Scanner;

public class Q63_PairSum {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.print("enter target sum: ");
        int target = inp.nextInt();

        boolean found = false;


        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pair found");
        }

        inp.close();
    }
}