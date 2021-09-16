import java.util.Scanner;
public class Short
{
    public static void main(String [] args)
     {
        Scanner str1=new Scanner(System.in);
        String s1=str1.nextLine();
        Scanner str2=new Scanner(System.in);
        String s2=str2.nextLine();
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2)
         {
           System.out.println(s2+s1+s2);
         }
        else
         {
            System.out.println(s1+s2+s1);
         }
      }
}
