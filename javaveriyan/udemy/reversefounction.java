package udemy;

public class reversefounction {

    //    static  int reverse (int n)
    //     {   
    //         int rev=0;
    //         while(n>0)
    //         {
    //         //  rev=0;
    //         int rem=n%10;
    //         rev =rev*10+rem;
    //         n =n/10;
    //         }
    //         return  rev ;
    //     }
    //         public static void main(String[] args) 
    //         {
            
    //             int  n=345;
    //          int  r=reverse(n);
    //           System.out.println(r);

    // }
       static boolean validate (String names)
    {
        return names.matches("[a-zA-Z\\s]+");
    }
       static boolean validate (int ages)
    {
        return  (ages>3  &&  ages<=18);
    }
    public static void main(String[] args) 
    {

        String name="sathya            moorthy";
        int age =18;
        System.out.println (validate (name));
        System.out.println(validate(age));

    }
}
