package Day14;
import java.util.Scanner;

public class Q56_FindDuplicates {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];
        System.out.println("enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        boolean[] visited = new boolean[size];

        System.out.println("duplicate elements are: ");
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }
            
            boolean isDuplicate = false;
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }
            
            if (isDuplicate) {
                System.out.println(numbers[i]);
            }
        }

        inp.close();
    }
}