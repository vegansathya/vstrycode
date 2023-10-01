public class lenofstring {

    public static void main(String[] args) {
        
        String string = " if you want to be extrodinary then you have to put extraordinary effort ";
       int  count =0;

        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)!=' ')
            count++;

        }
    System.out.println("the total no of string"+count);
    
    }
    
}
