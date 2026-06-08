package Day4;
import java.util.Scanner;
public class Q16_ArmstrongRange {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter lower limit ");
        int l = inp.nextInt();
        System.out.print("enter upper limit ");
        int u = inp.nextInt();
        for(int i = l ; i <= u ; i++) {
            
            int n = i;
            int num = n;
            int sum = 0 , d , count =0;

            while (n>0) {
            d = n%10;
             count = count +1;
            n=n/10;
        }
         n = num;
         
        while (n>0) {
            d = n%10;
            sum = sum + (int) Math.pow(d , count);
            n = n / 10;
        }
        
        if ( i == sum) {
            System.out.println( i + " " );
        }
}
       
      
        inp.close();





    }
}