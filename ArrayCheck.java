import java.util.Scanner;
public class ArrayCheck
{
   public static void main(String [] args)
     {
        Scanner num=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of array elements : ");
        n=num.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array values : ");
        for(int i=0;i<n;i++)
        {
          arr[i]=num.nextInt();
        }
        System.out.println("Enter Product : ");
        int product=num.nextInt();
        for(int i=0;i<n-1;i++)
         {
            for(int j=i+1;j<n;j=j++)
             {
                if(arr[i]*arr[j]==product)
                 {
                    System.out.println("True");
                     System.exit(0);
                 }
              }
          }
             System.out.println("False");
      }
}     
