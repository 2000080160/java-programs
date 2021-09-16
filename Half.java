import java.util.Scanner;
public class Half
{
    public static void main(String [] args)
     {
           System.out.println("Enter a string : ");
           Scanner str=new Scanner(System.in);
           String s=str.nextLine();
           int len=s.length();
           if(len%2==0)
            {
              s=s.substring(0,(len/2));
              System.out.println(s);
            }
           else
            {
              System.out.println("");
            }
      }
}
