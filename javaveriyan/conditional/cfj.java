// package  conditional;


import java.util.Scanner;
public class cfj {

     public static void main(String[] args) {
        
     int num;

    Scanner  sc =new Scanner(System.in);
    // int num;
    System.out.println("enter num");
    num=sc.nextInt();
    if(num>0)
    {
            if(num%2==0)
                    System.out.println("the num"+num+"is even");
            else
                    System.out.println("the num"+num+"is odd");



    }    
}
}