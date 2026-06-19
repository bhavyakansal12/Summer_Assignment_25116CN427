package Day17;
import java.util.ArrayList;
import java.util.Scanner;

public class Q67_IntersectionOfArrays {
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

    
        ArrayList<Integer> intersection = new ArrayList<>();

       
        for(int i = 0; i < n1; i++) {

            
            for(int j = 0; j < n2; j++) {

                if(arr1[i] == arr2[j]) {
                    if(!intersection.contains(arr1[i])) {
                        intersection.add(arr1[i]);
                    }
                }
            }
        }

       
        System.out.println("Intersection of arrays is:");
        for(int num : intersection) {
            System.out.print(num + " ");
        }

        inp.close();
    }
}