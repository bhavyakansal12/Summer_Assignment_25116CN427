package Day5;
import java.util.Scanner;

public class Q20_LargestPrimeFactor {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        long number = input.nextLong();
        long largestFactor = 1;

        while (number % 2 == 0) {
            largestFactor = 2;
            number = number / 2;
        }

       for (long i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number = number / i;
            }
        }

       
        System.out.println("The largest prime factor of is: " + largestFactor);
        
       
        input.close();
    }
}