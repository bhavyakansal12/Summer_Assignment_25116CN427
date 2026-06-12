package Day9;
import java.util.Scanner;

public class Q35_RepeatedCharacterPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = inp.nextInt(); 
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + i));
            }
            System.out.println();
        }
        
        inp.close();
    }
}