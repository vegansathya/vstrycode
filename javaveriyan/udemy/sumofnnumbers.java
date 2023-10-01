package udemy;

public class sumofnnumbers {
    public static void main(String[] args) {
        int i,sum,n;
        n=10;
        sum =0;
        for(i=0;i<=n;i++)
        {
            System.out.print(i+"+"+(i+1)+"=");
            sum=sum+(sum+1);
            System.out.println(sum);
            // +(0+i+1));
        }
    }


    
}
