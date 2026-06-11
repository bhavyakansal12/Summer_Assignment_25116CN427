package Day7;

import java.util.Scanner;

public class Q25_FactorialRecursion {

    
    public static int calculateFactorial(int n)  // fun declaration (prototype)
       

        // below in green curly braces is the fun defination
        { 
            if (n == 0 || n == 1) {     
            return 1;
        }
      
        return n * calculateFactorial(n - 1);
    }

    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = inp.nextInt();

      
        int result = calculateFactorial(number);        // fun call ho gya main mai 
            System.out.println("The factorial is: " + result);
        

       inp.close();
    }
}