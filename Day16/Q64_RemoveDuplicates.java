package Day16;
import java.util.Scanner;

public class Q64_RemoveDuplicates {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int[] unique = new int[n]; // to store unique elements
        int k = 0; // index for unique array
        // Step 1: Traverse original array
        for(int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            // Step 2: Check if arr[i] already exists in unique[]
            for(int j = 0; j < k; j++) {
                if(arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Step 3: If not duplicate → add to unique[]
            if(!isDuplicate) {
                unique[k] = arr[i];
                k++;
            }
        }

        // Step 4: Print unique elements
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }

        inp.close();
    }
}