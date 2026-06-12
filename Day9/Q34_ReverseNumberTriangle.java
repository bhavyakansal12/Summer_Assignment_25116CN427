package Day9;
import java.util.Scanner;

public class Q34_ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = inp.nextInt(); 
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        inp.close();
    }
}