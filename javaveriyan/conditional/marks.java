import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        
        
        Scanner j =new Scanner(System.in);
                        System.out.println("enter string");
                String  num =j.nextLine();


                if(num.matches("[01]+"))
                {
                 System.out.println("binary radix=2");

                }
                else
                {
                    if(num.matches("[0-7]+"))
                    {
                        System.out.println("octal");
                    }
                    else if(num.matches("[09]+"))
                    {
                        System.out.println("decimal");
                    }
                }





      
            }
        }