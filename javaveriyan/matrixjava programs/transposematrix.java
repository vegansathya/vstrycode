public class transposematrix {
    
    public static void main(String[] args) {
        int j;
        
        int a [][]= {{1,2,3},{4,5,6},{7,8,9}};
        int rows=a.length;
        int cols =a[0].length;
        int t[][] = new int [cols][rows]; 
        for(int i =0;i<cols ;i++)
        {
            for( j =0;j< rows;j++)
            {
                t[i][j]=a[j][i];

            }
        
        }
          for(int i =0;i<cols ;i++)
        {
            for( j =0;j< rows;j++)
            {
                System.out.print(t[i][j]);

            }
            System.out.println("");
        
        }



    }
}
