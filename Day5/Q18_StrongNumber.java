package Day5;
import java.util.Scanner;

public class Q18_StrongNumber {
public static void main(String[] args) {
    
    Scanner inp = new Scanner (System.in);

    System.out.print("enter the number to be checked: ");
int n = inp.nextInt();
int d, num = n;
int  sum = 0;

while (n>0) {
   int fact = 1;
    d = n%10;

    for (int i = 1; i<= d ; i++) {
        fact = fact * i;
    }
    sum = sum + fact;
    n = n/10;

}
if (num == sum) {
    System.out.println("entered number is strong number");
}
else {
    System.out.println("entered number is not a strong number");
}
inp.close();

}
}
