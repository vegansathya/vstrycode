package udemy;

public class discount {

 static double dis(double ...A)
 { 
    
    double  sum =0;
    for(int i =0;i<A.length;i++)
        sum+=A[i];
    if(sum< 500)
        
      return sum *0.10;
      else
        return sum* 0.20;

 }





    public static void main(String[] args) {
        // int arr[] =new int[10];
        System.out.println(dis(200,100,300));
    }
    
}
