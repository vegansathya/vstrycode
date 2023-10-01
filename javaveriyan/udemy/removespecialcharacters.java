package udemy;

public class removespecialcharacters {
    public static void main(String[] args) {
        // String str1="a!B@c#|aa@#$%^*";
        // String  str2 =str1.replaceAll("[^a-zA-Z0-9]","  ");
        // System.out.println(str);
        // System.out.println(str2);

        String str="abc def        gh i        jk lmnopqrst   uvwxyz";
         System.out.println(str);
        str =str.replaceAll("\\s+"," ").trim();
        System.out.println(str);
        String words []=str.split("\\s");
        //  System.out.println(str);
          System.out.println(words.length);

    
    
    
    }
    
}
