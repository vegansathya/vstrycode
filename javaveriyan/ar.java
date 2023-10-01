class ar{

    public static void main(String[] args) {
        
        int a[]=  {1,2,3,5,6};
        int i;
            // int n=  a.length()-1;

                int temp =a[0];

                System.out.println("array before rotating");
                  for( i=0;i<a.length;i++){
                    System.out.println(a[i]);

                  }



        for( i=1;i<a.length;i++)
        {
                    a[i-1]=a[i];
        }

        a[a.length-1]=temp  ;


        System.out.println("array after rotating");
          for(i=0;i<a.length;i++)
          {
                        
                    System.out.println(a[i]);

          }

    }
}