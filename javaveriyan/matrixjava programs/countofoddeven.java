public class countofoddeven {
    public static void main(String[] args) {
        
        int a [][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows=a.length;
        int cols = a[0].length;
        int oddcount =0;
        int evencount= 0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                    if(a[i][j]%2==0)
                     evencount++;
                     else
                    oddcount++;
            }
        }
        System.out.println("even count" +evencount);
     System.out.println("oddcount" +oddcount);







    }
    
}
