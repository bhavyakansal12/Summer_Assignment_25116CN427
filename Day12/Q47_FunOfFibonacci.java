package Day12;
import java.util.Scanner;

public class Q47_FunOfFibonacci {

    public static void printFibonacci(int terms) {
        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = inp.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.print("Fibonacci Sequence: ");
            printFibonacci(n);
        }

        inp.close();
    }
}