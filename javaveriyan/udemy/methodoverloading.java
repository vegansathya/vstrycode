package udemy;

public class methodoverloading {

    static byte  max (byte x,byte y)
     {

        return x>y?x:y;
     } 
     static int  max (int  x, int  y)
     {
            System.out.println("never ever give up");
        return x>y?x:y;
     } 
     static float max(float x,float y)
     {
        if(x>y)
            return x;
            else
        return y;
     }







    public static void main(String[] args) {
        byte a=10,b=5;

        
        System.out.println(max(a, b));
    }
    
}
