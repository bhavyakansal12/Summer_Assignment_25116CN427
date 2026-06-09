package Day6;
import java.util.Scanner;

public class Q22_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt(); 

        int decimal = 0; 
        int power = 0;   
        
        while (binary > 0) {
           
            int lastDigit = binary % 10;

           
            decimal += lastDigit * Math.pow(2, power);

           
            binary = binary / 10;

            
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
        sc.close();
    }
}