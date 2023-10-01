public class sparsematrix {
    public static void main(String[] args) {
        
        int a[][]={{1,0,0},{0,8,7},{0,0,0}};
         int count=0;
        int rows =a.length;
        int cols =a[0].length;
        int tot= rows*cols;

        for(int i= 0;i<rows;i++ )
        {
            for(int j=0;j<cols;j++)
            {
                if(a[i][j]==0)
             count++;

                
                
            }
        }
        if(tot> count/2)
        System.out.println("this is a sparse matrix");

    }

    
}
