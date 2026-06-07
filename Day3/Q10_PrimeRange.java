package Day3;
import java.util.Scanner;
public class Q10_PrimeRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting of range: ");
        int n1 = input.nextInt();
        System.out.print("Enter ending of range: ");
        int n2 = input.nextInt();
        
        for (int num = n1; num <= n2; num++) {
            int prime = 1;
            for (int i = 2; i <= num / 2; i++) { 
                if (num % i == 0) 
                    { prime = 0; 
                    break; }
                }
            if (prime == 1) 
               { System.out.println(num); }
        }
        input.close();
    }
}