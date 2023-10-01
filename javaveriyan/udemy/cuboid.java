package udemy;
import java.util.*;

public class cuboid {
    public static void main(String[] args) {
        
    Scanner sc =new   Scanner( System.in);

          int a,b,c;
          int volume,area;
    System.out.println("enter var");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    area =2*(a*b+b*c+c*a);
    volume =a*b*c;
    System.out.println(area);
    System.out.println(volume);
    
    }
    

}
