public class copyarray {

    public static void main(String[] args) {
        

        int a[]={1,2,3,4,5,6,7,8};
        int  b[]=new int [10];

for(int i=1;i<a.length;i++)
{
    b[i]=a[i];
}
System.out.println("enter copied num");
for(int i=a.length-1;i>=0;i--)
{
    System.out.println(b[i]);
}

    }
    
}
