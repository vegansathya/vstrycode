package udemy;

public class area {

    static int area(int a,int b)
    {
       int  c=a*b;
        return c;
    }
    static float area(float  a,float b)
    {
         float c= a*(b*b);
        return c;

    }

    static float area(int q,int w,int e)
    {
        float  c=(q*w*e)*(0.5f) ;
        return c;
    }


    public static void main(String[] args) {
        int l,b;
        float p= 3.14f;
        float  r;
        int q,w,e;


        int arearect= area(45,3);
        float areacircle= area  ( 3.14f,4.4f);
        float  areatrap=area (23,34,10);
        System.out.println("the area of circle "+arearect);
        System.out.println("the area of circle "+areacircle);
        System.out.println("the area of circle "+areatrap);

    }
    
}
