package Day4;
import java.util.Scanner;

public class Q13_Fibonacci {
public static void main(String[] args) {
    
    Scanner inp = new Scanner (System.in);

    System.out.print("enter the last number till where the series is to be printed");
int num = inp.nextInt();

int n3;
int n1 = 0;
int n2 = 1;

while( n2 <= num) {
n3 = n1+n2;
n1 = n2;
n2 = n3;

System.out.print(n3);
}
inp.close();





















}
}