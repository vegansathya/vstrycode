public class productmatrix {
    public static void main(String[] args) {
       int  a[][]={{1,2,3},{4,5,6},{7,8,9}};
       int  b[][]={{1,2,3},{4,5,6},{7,8,9}};
       int rows =a.length;
       int  cols =a[0].length;


       int c[][]=new int[3][3];
       for(int i=0;i<rows;i++)
       {
        for(int j=0;j<cols;j++)
        {
            c[i][j]+=a[i][j]+b[i][j];
             System.out.print(c[i][j]);
            //   System.out.println ();

        }
         System.out.println();
        System.out.println();

       }



        



    }
    
}
