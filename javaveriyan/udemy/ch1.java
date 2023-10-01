package udemy;
import java.util.Scanner;


public class ch1 {
    public static void main(String[] args) {
        
                // Scanner sc= new Scanner(System.in);
                // int num;
                // System.out.println("enter the new num");
                // num =sc.nextInt();
                // switch(num)
                // {
                //     case 1:
                //     System.out.println("monday");
                //     break;

                //     case 2:
                //      System.out.println("TUESDAY");
                //      break;
                //      case 3:
                //       System.out.println("wednesday");
                //       break;
                //       case 4:
                //        System.out.println("thursday");
                //        break;
                //        case 5:
                //         System.out.println("friday");
                //         break;
                //         case 6:
                //          System.out.println("saturday");
                //          default:
                //             System.out.println("not valid");
                // }

                            Scanner sc =new Scanner(System.in);

                            String web;
                            System.out.println("enter the website");
                            web=sc.nextLine();

                            String domain=web.substring(web.lastIndexOf(".")+1);
                            switch(domain)
                            {
                                case "web":
                                        System.out.println("this is web");
                                        break;

                                case "org":
                                        System.out.println("this is organisation");
                                        break;
                                case "in":
                                        System.out.println("this is india");
                                               break;
                                case "com":
                                        System.out.println("this is commercial");
                                        break;
                                default:
                                        System.out.println("notfound");
                            }


    }
    
}
