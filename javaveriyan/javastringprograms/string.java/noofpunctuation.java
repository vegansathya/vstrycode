public class noofpunctuation {
    public static void main(String[] args) {
        
        var count =0;
        String str="hey , 'listen  if you are not ready' to work for you 'then who' else ,do it";
         for(int i=0;i<str.length();i++)
         { 
          //  if(str.charAt(i)==  "!"||str.charAt(i)==";"||str.charAt(i)==",")
          if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
str.charAt(i) == '\'' || str.charAt(i) == '\'' || str.charAt(i) == ':')   

           {

           
             count++;
           }
         }
        
         System.out.println("the no of punctuations exists in the string is "+count);

    }
    
}
