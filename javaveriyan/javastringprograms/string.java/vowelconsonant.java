public class vowelconsonant {
   
    public static void main(String[] args) {
            
            int vcount =0;
            int ccount =0;
            String str="just woRK KEEP WORKING CONSISTEnNCY IS THE KEY";


            str =str.toLowerCase();


            for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i) =='a'||str.charAt(i) =='e'||str.charAt(i)== 'i' || str.charAt(i)=='o'||str.charAt(i) =='u')
                    {
                        vcount++;
                    }

                    else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                    {
                            ccount++;

                    }
                }
                    System.out.println("number of vowels" +vcount);
                    System.out.println("number of conconants"+ccount);
                

        
    }

    
}
