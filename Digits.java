import java.util.Scanner;
public class Digits
{
   public static void main(String [] args)
    {
       Scanner str=new Scanner(System.in);
       System.out.println("Enter your email id : ");
       String s=str.nextLine();
       int len=s.length();
       int count=0;
       for(int i=0;i<len;i++)
       {
          if (s.charAt(i)>='0' && s.charAt(i)<='9')
            {
               count=count+1;
             }
        }
          System.out.println("Number of digits in the entered string are : " + count);
     }
}
