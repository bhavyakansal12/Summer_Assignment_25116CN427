package Day5;
import java.util.Scanner;
public class Q17_PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        /* System.out.print("enter the number to be checked: ");
        int n = inp.nextInt();

        if ( n%7 == 0 || n%10 == 7) {
            System.out.print("given number is a perfet number");
        }
        else {
             System.out.print("given number is not a perfet number");
        }
        inp.close(); 
 
        // now m writing a code so that i can print all the perfect numbers in a range because i have lack of practice about this 

        System.out.print("enter the lower limit: ");
        int l = inp.nextInt();

         System.out.print("enter the upper limit: ");
        int u = inp.nextInt();

        for (int i = l ; i <= u ; i++) {
           
           if ( i%7 == 0 || i%10 == 7) {
            System.out.println(i + " ");
           }
        }
        inp.close(); 
 

        by mistake above 2 codes are of buzz number , now i will write them for perfect number */
       
        
        
       System.out.print("enter the number to be checked: ");
        int n = inp.nextInt();
        int sum = 0;

        for(int i = 1 ; i <= n/2 ; i++) {
            
            if ( n % i == 0) {
                sum = sum + i;
            }
         }

         if ( sum == n) {
            System.out.println("given number is perfect");
         }
         else {
            System.out.println("given number is not perfect");
         }
         inp.close(); 



    // now m writing a code so that i can print all the perfect numbers in a range because i have lack of practice about this 
         
    /* System.out.print("enter the lower limit: ");
         int l = inp.nextInt();

         System.out.print("enter the upper limit: ");
        int u = inp.nextInt();

        for ( int i = l ; i <= u ; i++) {
            int sum = 0;

            for (int j = 1 ; j <= i / 2 ; j ++) { 
                

                if (i % j == 0) {
                    sum = sum + j;
                }
              }
              if ( sum == i) { 
                System.out.println( i + " ");
         }

            } */
 }
}

