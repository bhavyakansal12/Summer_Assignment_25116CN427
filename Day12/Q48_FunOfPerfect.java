package Day12;
import java.util.Scanner;

public class Q48_FunOfPerfect {

    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }

        inp.close();
    }
}