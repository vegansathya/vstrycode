package functions;



public class passingobjects {
//     static void update(int a[])
//     {
//         a[0]=25;
//     }
//     public static void main(String[] args) 
//     {
//         int a[]={1,2,3,4,5};
//         for(int i=0;i<a.length;i++)
//         {
            
//         System.out.println(a[i]);

//         }
//         update(a);
//           System.out.println(a[0]);






static String username(String email)
    {
    int a=email.indexOf('@');
   String   name =email.substring(0, a);
    return name;
    }

public static void main(String[] args) 
{
        String name;
    String email ="vegansathya@gmail.com";
    username(email);
    System.out.println(name+"");
    



    }
}

