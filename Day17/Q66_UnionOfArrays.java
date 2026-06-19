package Day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Q66_UnionOfArrays {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of first array: ");
        int n1 = inp.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("enter elements of first array:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = inp.nextInt();
        }

       
        System.out.print("enter size of second array: ");
        int n2 = inp.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("enter elements of second array:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = inp.nextInt();
        }

        
        ArrayList<Integer> union = new ArrayList<>();

       
        for(int i = 0; i < n1; i++) {
            if(!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
        }

       
        for(int i = 0; i < n2; i++) {
            if(!union.contains(arr2[i])) {
                union.add(arr2[i]);
            }
        }

      
        System.out.println("Union of arrays is:");
        for(int num : union) {
            System.out.print(num + " ");
        }

        inp.close();
    }
}