public class Sort
{
    public static void main(String [] args)
      {
        int [] arr={4,2,5,8,9,10,12,14,16,30,40,1}; 
        int i,j;
        for(i=0;i<arr.length-1;i++)
          {
            for(j=0;j<(arr.length-i-1);j++)
              {
                if (arr[j]>arr[j+1])
                  {
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                   }
               }
            }
         System.out.println("The sorted array is : ");
         for(i=0;i<arr.length;i++)
           System.out.print(arr[i] + " ");
        }
}
