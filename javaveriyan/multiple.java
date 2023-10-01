public class multiple
 {
    public static void main(String[] args)
     {
        int a[][]={{3,4,5},{5,6,7},{7,6,5}};
        int b[][]={{2,5,6},{6,7,8},{8,9,7}};
        int c[][]= new int [3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }

        for(int x[]:c)
        {
            for(int y:x)
            {
                System.out.println(y+"");
            }
             System.out.println("");
        }
    }
    
}
