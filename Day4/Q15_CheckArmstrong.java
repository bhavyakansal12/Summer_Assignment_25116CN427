package Day4;
import java.util.Scanner;

public class Q15_CheckArmstrong {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter the number to be checked whether armstrong or not: ");
        int n = inp.nextInt();
        int sum = 0;
        int num = n;
        int count =0;
        int d;
        while (n>0) {
             d = n%10;
            count = count +1;
            n=n/10;
        }
         n = num;
         
        while (n>0) {
            d = n%10;
            sum = sum + (int) Math.pow(d , count);
            n = n / 10;
        }
        if (num == sum) {
            System.out.println("entered number is armstrong ");
        }
        else {
            System.out.println("entered number is not armstrong ");
        }
        inp.close();





    }
}