package udemy;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n,rem;
        int sum =0;
         System.out.println("enter a no");
        n=sc.nextInt();
       int  s=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(s==sum)
        {
        System.out.println("this is a armstrong no");
        }
        else
        {
        System.out.println("this is not a armstrong n0");
        }
    

    }
    
}
