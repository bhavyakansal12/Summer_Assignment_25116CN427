package Day11;
import java.util.Scanner;

public class Q41_FunOfSum {

    public static int sum(int n1, int n2) {
        return n1 + n2; 
    }

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int a = inp.nextInt(); 

        
        System.out.print("Enter the second number: ");
        int b = inp.nextInt(); 

        
        int total = sum(a, b);

        System.out.println("The sum is: " + total);
        inp.close();
    }
}