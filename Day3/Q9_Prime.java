package Day3;
import java.util.Scanner;
public class Q9_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int n = input.nextInt();
        int i;
        int prime = 1;
        for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = 0; 
                    break;
                }
            }
        if (prime == 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
        input.close(); 
    }
}