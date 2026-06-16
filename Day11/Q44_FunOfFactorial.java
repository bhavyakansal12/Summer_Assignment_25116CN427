package Day11;
import java.util.Scanner;

public class Q44_FunOfFactorial {

    public static long findFactorial(int num) {
        long result = 1;
        
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = inp.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
           
            System.out.println("The factorial is: " + findFactorial(n));
        }

        inp.close();
    }
}