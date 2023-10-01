package udemy;

public class my {
    public static void main(String[] args) {
        double s=0;
        for(String x:args)
        {
            s+= Double.parseDouble(x);
        } 
        System.out.println("sum is" +s);
    }
    
}
