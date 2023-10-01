
package   udemy;
public class gcd {
    
        
         int gcd(int m,int n)
        {
            while(m!=n)
            {
                if(m>n) m=m-n;
                else   n=n-m;
            }
            return m;

        }
            public static void main(String[] args) {
                    gcd x=new gcd();
System.out.println(x.gcd(25,15));

    
    }
    
}
