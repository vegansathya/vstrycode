public class add2matrix {
    public static void main(String[] args)
     {
        int a[][]={{1,2,3},{1,2,3},{3,4,5}};
        int b[][]={{1,2,3},{4,5,6},{5,4,3}};

        int c[][]=new int[3][3];
        for(int  i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ "");


            }
                System.out.println();
        }
        // System.out.println(c[i][j]);

    }
    
}
