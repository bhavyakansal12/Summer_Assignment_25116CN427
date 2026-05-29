import java.util.Scanner;
public class Q4_NoOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        long number = scanner.nextLong();
        long originalNumber = number; 
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
             while (number != 0) {
                number = number / 10; 
                count++;          
            }
        }
        System.out.println("The number of digits in " + originalNumber + " is: " + count);
        scanner.close();
    }
}