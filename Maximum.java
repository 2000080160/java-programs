public class Maximum
{
      public static void main(String[] args)
{
        int i,j,k=0;
        int [][] arr=new int[3][3];
        for(i=0;i<arr.length;i++)
        {
          for(j=0;j<arr[i].length;j++)
            {
              arr[i][j]=Integer.parseInt(args[k]);
              k++;
             }
         }
           int max=arr[0][0];
           for(i=0;i<arr.length;i++)
           {
              for(j=0;j<arr[i].length;j++)
                {
                   if (arr[i][j]>max)
                     {
                        max=arr[i][j];
                      }
                 }
             }
         System.out.println("The gievn array is");
             for(i=0;i<arr.length;i++)
        {
          for(j=0;j<arr[i].length;j++)
            {
              System.out.print(arr[i][j]+"\t");
             }
             System.out.println();
         }
              System.out.println("The maximum element in the array is : " + max);
    }
}
