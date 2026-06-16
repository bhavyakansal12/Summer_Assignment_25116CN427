package Day12;
import java.util.Scanner;

public class Q45_FunOfPalindrome {

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int d = num % 10;
            reversedNum = (reversedNum * 10) + d;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println("entered number is not  palindrome.");
        }

        inp.close();
    }
}



