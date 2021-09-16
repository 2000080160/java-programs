import java.util.Scanner;
public class Concat
{
  public static void main(String [] args)
    {
      Scanner str1=new Scanner(System.in);
      System.out.println("Enter the first string : ");
      String s1=str1.nextLine();
      Scanner str2=new Scanner(System.in);
      System.out.println("Enter the second string : ");
      String s2=str2.nextLine();
      String s3="";
      String l=s1.toLowerCase();
      String m=s2.toLowerCase();
      int len=l.length();
      if(l.charAt(len-1)==m.charAt(0))
      {
         s3=l+m.substring(1);
      }
      else
      {
        s3=l+m;
      }
       //String k=s3.toLowerCase();
       System.out.println(s3);
     }
}
