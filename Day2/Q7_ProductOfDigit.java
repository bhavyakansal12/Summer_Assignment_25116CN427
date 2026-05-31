package Day2;
import java.util.Scanner;
public class Q7_ProductOfDigit {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.print("enter the number:");
        int n = input.nextInt();
        int product = 1;
        while(n>0) {
            int d = n%10;
            product = product*d;
            n = n/10;
        }
System.out.println("product of digits of number is:" + product );
input.close();
}
}