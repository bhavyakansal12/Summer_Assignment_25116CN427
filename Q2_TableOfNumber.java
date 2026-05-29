import java.util.Scanner;
public class Q2_TableOfNumber {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number to print its multiplication table: ");
        int num = scanner.nextInt();
        System.out.println("multiplication table of" + num);
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(product);
        }
        scanner.close();
    }
}