package udemy;

public class bitwise {
    public static void main(String[] args) {
        int x=-0b1010;
        int y;
        y=x>>1;
        System.out.println(x);
        System.out.println(y);

        System.out.println(String.format("%s",Integer.toBinaryString(y)));
        int z=-0b0101;
        System.out.println(z); 
    
}
}