public class Duplicate
{
   public static void main(String [] args)
    {
       int [] arr={12,34,12,45,67,89};
       int i,j,temp;
        for(i=0;i<arr.length-1;i++)
         {
           for(j=0;j<(arr.length-i-1);j++)
             {
               if(arr[j]>arr[j+1])
               {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
             }
           }
         int [] newarr=new int[arr.length];
         j=0;
          for(i=0;i<arr.length-1;i++)
              if(arr[i]!=arr[i+1])
                newarr[j++]=arr[i];
               newarr[j++]=arr[arr.length-1];
            for(i=0;i<j;i++)
                  System.out.print(newarr[i] + " ");
   }
}
