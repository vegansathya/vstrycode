import java.util.*;

public class sumtillsingledigit 
{
   
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int rem=0;
            int sum =0 ;
            System.out.println("java");
            System.out.println("fjofaofoehoehga");
            while(num>99)
            {
                while(num>9)
                {
                    rem=num%10;
                    sum+=rem;
                    num=num/10; 
                }
                num=sum;
                sum=0;
                
                
            }
            System.out.println(num);
        }
    }


}
 


