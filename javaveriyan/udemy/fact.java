package udemy;

public class fact {
    public static void main(String[] args) {
        int n =5;
        int i;
        int fact=1;
        if(fact==0)
                System.out.println(1);
            else{
                for( i=1;i<=n;i++)
                {
                    fact =i* fact ;
        
                }
            }
            System.out.println("factorial of "  +n+ "is" +fact );

    }
    
}
