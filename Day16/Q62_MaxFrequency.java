package Day16;
import java.util.Scanner;

public class Q62_MaxFrequency {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int maxCount = 0;      
        int maxElement = arr[0]; 
        
        for(int i = 0; i < n; i++) {

            int count = 0;

            
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

           
            if(count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

       
        System.out.println("Maximum frequency element is: " + maxElement);
        System.out.println("Frequency is: " + maxCount);

        inp.close();
    }
}