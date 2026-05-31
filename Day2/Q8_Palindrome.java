package Day2;
import java.util.Scanner;
public class Q8_Palindrome {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number to be checked:");
        int n = input.nextInt();
        int OriginalNumber = n;
        int rev = 0;
        while (n>0) {
             int d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
if (OriginalNumber == rev) {
    System.out.println("entered number is palindrome");
}
else {
     System.out.println("entered number is not palindrome");
}
input.close();
}
}