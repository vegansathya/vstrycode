import java.util.Arrays;
public class anagramj {





       public static void main(String[] args) {
        
        String str1 = "grab";
        String str2 ="barg";

       str1 = str1.toLowerCase();
       str2 =str2.toLowerCase();

       if(str1.length()!=str2.length())
       {

        System.out.println("they have to be equal");
       }
       else{


        char[]string1= str1.toCharArray();
        char[]string2=str2.toCharArray();

              Arrays.sort(string1);
              Arrays.sort(string2);
               if(Arrays.equals(string1,string2)==true)
               {
                System.out.println("this is a valid anagram");
               }
               else
               System.out.println("this is not a anagram");
               


       }




    }
    
}
