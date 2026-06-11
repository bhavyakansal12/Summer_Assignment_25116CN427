package Day7;
import java.util.Scanner;

public class Q26_FibonacciRecursion {

   
    public static int calculateFibonacci(int n) {
       
        if (n == 0 || n == 1) {
            return n;
        }
        
        
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Fibonacci position (n): ");
        int position = scanner.nextInt();

     
            int result = calculateFibonacci(position);
            System.out.println("The Fibonacci number at position " + position + " is: " + result);
        

        scanner.close();
    }
}




/*import java.util.Scanner;

public class FibonacciSeriesRecursion {

   
    public static int calculateFibonacci(int n) {
      
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
      
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to print: ");
        int terms = scanner.nextInt();

     
            System.out.println("Fibonacci Series up to " + terms + " terms:");
            
           
            for (int i = 0; i < terms; i++) {
                
                System.out.print(calculateFibonacci(i) + " ");
            }
            System.out.println(); 
        

        scanner.close();
    }
} */