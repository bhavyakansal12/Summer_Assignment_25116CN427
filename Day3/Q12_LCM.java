package Day3;

import java.util.Scanner;

public class Q12_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int n1 = num1;
        int n2 = num2;
        
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        
        int gcd = num1; 
        
        int lcm = (n1 * n2) / gcd;

        System.out.println("The LCM is: " + lcm);

        scanner.close();
    }
}