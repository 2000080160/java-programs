import java.util.Scanner;
public class Copy
{
   public static void main(String [] args)
    {
      Scanner str=new Scanner(System.in);
      System.out.println("Enter the string : ");
      String s=str.nextLine();
       String k="";
      int len=s.length();
      for(int i=0;i<len;i++)
       {
         k=k+s.substring(0,2);
       }
     System.out.println(k);
     }
}
