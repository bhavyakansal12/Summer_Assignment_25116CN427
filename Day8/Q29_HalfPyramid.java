package Day8;
import java.util.Scanner; 

public class Q29_HalfPyramid {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        
        int rows = inp.nextInt(); 
        
       for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // yaha its wrking like a line finisher ,, agar inside blue braces hota toh imidiately after printing a star it would jump to next line .
        }
        inp.close();
    }
}