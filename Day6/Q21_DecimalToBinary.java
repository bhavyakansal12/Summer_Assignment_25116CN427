package Day6;
import java.util.Scanner;

public class Q21_DecimalToBinary {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = inp.nextInt();
        
       String binary = "";

        
        while (decimal > 0) {
            int remainder = decimal % 2;     
            binary = remainder + binary;     
            decimal = decimal / 2;           
        }

        
        System.out.println("Binary string is: " + binary);
        
        inp.close();
    }
}