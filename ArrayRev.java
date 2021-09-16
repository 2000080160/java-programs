public class ArrayRev
{
	public static void main(String[] args) 
{
                int i,j,k=0;
		int [][] arr=new int[2][2];
                for(i=0;i<arr.length;i++)
              {
                   for(j=0;j<arr[i].length;j++)
                    {
                      arr[i][j]=Integer.parseInt(args[k]);
                      k++;
                    }   
              }
               for(i=arr.length-1;i>=0;i--)
              {
                   for(j=arr[i].length-1;j>=0;j--)
                    {
                      System.out.print(arr[i][j]);
                    }  
                    System.out.println();
              }
	}
}
