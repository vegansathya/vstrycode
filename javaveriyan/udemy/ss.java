package udemy;
import java .util.Scanner;


public class ss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
       

                  


                 
                
                System.out.println("1.ADD 2.SUB  3.MUL 4.DIV");
                System.out.println("enter 2 nos");
                a=sc.nextInt();
                b=sc.nextInt();
                sc.nextLine();
                 System.out.println("enter option in words");
                String  option =sc.nextLine();


                 switch(option)
                 {
                    case "ADD":
                    System.out.println("THE SUM IS"+ a+b);
                    break;
                    case "SUB":
                    System.out.println(a-b);
                    break;
                    case "MUL":
                    System.out.println(a*b);
                    break;
                    case "DIV":
                    System.out.println(a/b);
                    break;
                     default:
                    System.out.println("invalid operation");
                 }
                

            }


    }
    

