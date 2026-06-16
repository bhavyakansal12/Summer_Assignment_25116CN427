// ques 54 of summ assign
package Day14;
import java.util.Scanner;

public class Q54_FrequencyOfElement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inp.nextInt();
        }

        System.out.print("enter the number to find frequency of: ");
        int target = inp.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println("the number appears " + count + " times.");

        inp.close();
    }
}