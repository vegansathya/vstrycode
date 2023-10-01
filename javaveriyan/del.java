public class del {
    public static void main(String[] args) {
        

        int a[]=new int[10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;


        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+"");
        }

        ;
        int  index=  a[2];
        int p=2;
        for(int i=index;i>p;i--)
        {
                // System.out.println(a[i])
                a[i-1]=a[i];

        }
        a[p]=index;
        System .out.println("array after inserting");
        for(int j=0;j<n;j++)
        {
                 System .out.println(a[j]+"");
        }
    }
    
}
