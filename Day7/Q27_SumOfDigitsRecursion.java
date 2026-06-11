/*package Day7;
import java.util.Scanner;

public class Q27_SumOfDigitsRecursion {

    
    public static int sumOfDigits(int n) {
        // Base Case
        if (n < 10) {
            return n;
        }
        
        // Recursive Case
        int lastDigit = n % 10;
        int remainingNumbers = n / 10;
        
        return lastDigit + sumOfDigits(remainingNumbers);
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

       
        int positiveNumber = Math.abs(number);  // Math.abs() turns -ve to +ve number

        int result = sumOfDigits(positiveNumber);
        System.out.println("The sum of digits of " + number + " is: " + result);

        scanner.close();
    }
} */



package Day7;
import java.util.Scanner;

public class Q27_SumOfDigitsRecursion {

    
    public static int sumOfDigits(int n , int sum) {
        // Base Case
        if (n < 10) {
            return n + sum;
        }
        
        // Recursive Case
        int d = n % 10;
         sum = sum + d;
        
        return sumOfDigits(n/10 , sum);
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

       
        int positiveNumber = Math.abs(inputNumber);  // Math.abs() turns -ve to +ve number

        int result = sumOfDigits(positiveNumber , 0);
        System.out.println("The sum of digits of " + inputNumber + " is: " + result);

        scanner.close();
    }
}