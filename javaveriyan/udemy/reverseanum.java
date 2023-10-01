package udemy;
import java.util.Scanner;

public class reverseanum {
    public static void main(String[] args) {

        int num;
        int rem=0;
        int rev=0;
        int sum =0;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();

        while(num>0)
        {
            rem=rem%10;
            rev=rem*10+rem;
            sum=num/10;
        }

            System.out.println("the output is"+rev);
        
    }
    
}
