

public class lowertrianglematrix {
    public static void main(String[] args) {
        
        int a[][]={{1,2,3},{8,6,4},{4,5,6}};
        int rows=a.length;
        int cols=a[0].length;

        if(cols!=rows)
        {
            System.out.println("they should have same dimensions");
        }
        else
        {
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(j>i)
                        System.out.print("0");
                        // System.out.print("");

                    else
                        System.out.print(a[i][j]+"");
                    // System.out.print();
                }
                System.out.println();
            }
        }

        
    }
    
}
