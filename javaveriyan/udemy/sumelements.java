package udemy;

public class sumelements {

    static  int sumof(int ...A)
    {
        if(A.length ==0) return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=0;i<A.length;i++)
        if(A[i]>max)
                max =A[i];
        
            return  max;


        }
    




    public static void main(String[] args) {
        


        System.out.println(sumof());
        System.out.println(sumof(3,4));
        System.out.println(sumof(34,56,7));
        System.out.println(sumof(1,2,3,4));
    }






    
}
