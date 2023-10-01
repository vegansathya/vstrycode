package udemy;

public class pass {

static void args(int ...A)
         {
            for(int x:A)
            {
                System.out.print(x);
            }
        
         }

    public static void main(String[] args) {
        
     
    // args();
    args(4,5,6);
    args(new int[]{2,3,4,5,6,7,8,8});
    // System.out.println(t);
    }
    
}
