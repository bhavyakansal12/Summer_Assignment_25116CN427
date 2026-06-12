package Day10;
import java.util.Scanner;

public class Q38_ReversePyramid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = inp.nextInt(); 
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        inp.close();
    }
}