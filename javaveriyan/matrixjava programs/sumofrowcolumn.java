public class sumofrowcolumn {
    public static void main(String[] args) {
        
        int  a [][]={{1,2,3},{4,5,6},{7,8,9}};
        int i;
        int j;
int colcount;
int rowcount;

        int rows =a.length;
        int cols=a[0].length;



for(i=0;i<rows;i++)
{
    rowcount =0;
    for(j=0;j<cols;j++)
    {
        rowcount +=a[i][j];

    }
    System.out.println("sum of"+ (i +1)+"row is" +rowcount);
}


for( i=0;i<rows;i++)
{
    colcount =0;

    for(j=0;j<rows;j++){
        // colcount=0;
        colcount+=a[i][j];
    }
    System.out.println("sum of"+ (i+1)+"col  is" +colcount);
         }            

    }
}
