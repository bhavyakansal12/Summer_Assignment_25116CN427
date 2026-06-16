package Day11;
import java.util.Scanner;

public class Q42_FunOfMax {

    public static int findMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = inp.nextInt();

        System.out.print("Enter the second number: ");
        int b = inp.nextInt();

        int max = findMax(a, b);

        System.out.println("The maximum number is: " + max);

        inp.close();
    }
}