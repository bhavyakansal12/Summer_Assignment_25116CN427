package Day6;
import java.util.Scanner;

public class Q24_PowerWithoutPow {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        
        long result = 1; 

        
        for (int i = 1; i <= n; i++) {
            result = result * x; 
        }

       
        System.out.println("Answer is: " + result);
        
        sc.close();
    }
}