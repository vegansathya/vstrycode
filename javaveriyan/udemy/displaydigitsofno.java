package udemy;

public class displaydigitsofno {
    public static void main(String[] args) {
        int n,sum;
        int rem;
        n=257;

        while(n>0)
        {
            rem= n%10;
            
            n=n/10;
             System.out.println(rem);
        }
        // System.out.println(rem);

    }
    
}
