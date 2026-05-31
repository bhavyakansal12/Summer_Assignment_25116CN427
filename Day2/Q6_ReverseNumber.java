package Day2;
import java.util.Scanner;
public class Q6_ReverseNumber {
    public static void main (String[]args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("no enter kariye: ");
        int n = Input.nextInt();
        int rev = 0;
        while (n>0){
            int d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
System.out.println("reversed number is:" + rev);
Input.close();
}
}