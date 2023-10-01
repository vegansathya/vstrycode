package udemy;
public class primeno 
{

    int gcd(int m,int n)
{
// int count;
for(int i=2;i<n/2;i++)
        {
        if(n%i==0)
            return false;
        }

        
        // System.out.println("never stop");
         return true;
}

    public static void main(String[] args) {
                primeno x=new primeno();
System.out.println(isprime(24));
 
    }
    
}
