package udemy;
import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a num");
        // System.out.p
        
         int num;
        int rem =0;
        int count=0;
                num=sc.nextInt();

         while( num >0)
         {
            // rem=rem%10;
            // count++;
            num= num /10;
            count++;


         }
         System.out.println("the num contains "+count+"digits");

    }
    
}
