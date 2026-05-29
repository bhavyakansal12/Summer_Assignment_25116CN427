import java.util.Scanner;
public class Q3_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer(N): ");
        int N = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i; 
        }
        System.out.println("The factorial of " + N + " is: " + factorial);
        scanner.close();
    }
}