package Day4;
import java.util.Scanner;

public class Q14_NthFibonacciTerm {
public static void main(String[] args) {
    
    Scanner inp = new Scanner (System.in);

    System.out.print("enter the nth term to be found: ");
int n = inp.nextInt();

int i;
int n1 = 0;
int n2 = 1;
int n3 =0;

for (i = 1 ; i<= n-2 ; i++) {
n3 = n1+n2;
n1 = n2;
n2 = n3;
}
System.out.print(n3 + " ");

inp.close(); 
}
}