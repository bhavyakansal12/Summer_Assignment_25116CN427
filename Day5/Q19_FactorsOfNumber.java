package Day5;
import java.util.Scanner;

public class Q19_FactorsOfNumber {
public static void main(String[] args) {
    
    Scanner inp = new Scanner (System.in);

    System.out.print("enter the number whose factors are to be found:  ");
int n = inp.nextInt();

for (int i = 1; i <= n ; i++) {
    if(n%i == 0) {
        System.out.println(i + " ");
    }
}
inp.close();
}
}