package Day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Q68_CommonElements {
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

        ArrayList<Integer> common = new ArrayList<>();

        
        boolean[] used = new boolean[n2];

        for(int i = 0; i < n1; i++) {

            for(int j = 0; j < n2; j++) {

                if(arr1[i] == arr2[j] && !used[j]) {
                    common.add(arr1[i]);
                    used[j] = true; 
                    break;
                }
            }
        }

        System.out.println("Common elements are:");
        for(int num : common) {
            System.out.print(num + " ");
        }

        inp.close();
    }
}