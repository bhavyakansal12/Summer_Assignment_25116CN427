package Day6;
import java.util.Scanner;

public class Q23_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
       
        while (n > 0) {
            // taking out the last bit and checking o or 1 hai kyy
            if (n % 2 == 1) {    
                count++;
            }
            // removing the last bit we checked just now 
            n = n / 2;
        }

        System.out.println("The number of set bits is: " + count);
        sc.close();
    }
}
