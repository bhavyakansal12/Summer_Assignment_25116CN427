package Day12;
import java.util.Scanner;

public class Q46_FunOfArmstrong {

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int count = 0;
        int temp = num;

        while (temp > 0) {
            temp /= 10;
            count++; 
        }

        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        inp.close();
    }
}