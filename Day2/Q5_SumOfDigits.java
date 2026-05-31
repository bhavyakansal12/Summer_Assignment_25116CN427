package Day2;
import java.util.Scanner;
public class Q5_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt(); 
        int sum = 0;
        while (num > 0) {
            int d = num % 10; 
            sum = sum + d;       
            num = num / 10;        
        }
        System.out.println("The sum of digits of is: " + sum);
        input.close();
}
} 