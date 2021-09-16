import java.util.Scanner;
class Power
{
  public static void main(String [] args)
    {
       Scanner p=new Scanner(System.in);
       System.out.println("Enter two integer values : ");
       int x=p.nextInt();
       int y=p.nextInt();
       int k=1;
       for(int i=1;i<=y;i++)
       {
         k=k*x;
       }
       System.out.println(x + " power " + y  +  " is : " + k);
    }
}
