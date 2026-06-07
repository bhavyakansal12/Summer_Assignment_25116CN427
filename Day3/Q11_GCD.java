package Day3;

import java.util.Scanner;

public class Q11_GCD {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int remainder;

        while (num2 != 0) {
            remainder = num1 % num2;
            num1 = num2;  
            num2 = remainder; 
        }
        
        System.out.println("The GCD is: " + num1);
         scanner.close();
    }
}