public class uppertrianglematrix {
    
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                     { 4,5,6},
                     {7,8,9}};
    int rows =a.length;
    int col=a[0].length;
    if(rows!=col)
    System.out.println("");

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<col;j++)
        {
            if(i>j)
            System.out.print("0");
            else
            System.out.print(a[i][j]);
            System.out.print("");
        }
        System.out.println();
    }

    }
}
