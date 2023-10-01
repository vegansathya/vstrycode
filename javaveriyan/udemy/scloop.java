package udemy;
import java .util.*;
public class scloop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter a num");
        int n=scan.nextInt();

        int r;
        String str="";
        while(n>0)
        {
            r =n%10;
            n=n/10;
            str =str +r;
        }
        System.out.print(str);
        char c ;
        for(int i=str.length()-1;i>=0;i--)
        {
                    c= str.charAt(i);
                    switch(c)
                    {
                        case'0':System.out.println("zero");
                        break;
                        case '1':System.out.println("two");
                        break;
                        case '2':System.out.println("three");
                        break;
                        case '3':System.out.println("four");
                        break;
                        case '4':System.out.println("five");
                        break;
                        default:
                        System.out.println("six");
                    }
        }
        

    }
    
}
