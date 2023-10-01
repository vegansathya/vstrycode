package udemy;

public class change {
    static void change(int arr[],int index,int value)
    {
            arr[index]=value;



    }







    public static void main(String[] args) {
        
        int arr[]={1,3,4,5,6,7};

    change(arr,3,78);

    for(int x:arr)
    {
        System.out.println(x);
    }
    }
    
}
