package Day7;
import java.util.Scanner;

public class Q28_RecursionReverseNumber {

    public static int reverseNumber(int number, int rev) {
        // Base Case
        if (number == 0) {
            return rev;
        }

        
        int d = number % 10;
        
         rev = (rev * 10) + d;

        // Recursive Case
        return reverseNumber(number / 10, rev);
    }

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int inputNumber = scanner.nextInt();

        int positiveNumber = Math.abs(inputNumber);

        // fun call 
        int result = reverseNumber(positiveNumber, 0);

        
     if (inputNumber <0) {
        result = -result;
     }
             System.out.println("Reversed number: " + result);

        scanner.close();
    }
}