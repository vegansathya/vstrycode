
// import java.util.*;
public class armstrong {
   
    public static void main(String[] args) {
        int sum=0;
        int rem;
        int num=153;

        while(num>0)
        {
            rem=num%10;
            sum+=sum+Math.pow(rem, 3);
            num=sum/10;

        }

        if(num==sum)
        {

        
        System.out.println("the num is armstrong");
        }
        else
        System.out.println("the no is not armstrong");
    }
    
}
