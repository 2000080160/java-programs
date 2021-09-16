import java.util.Scanner;
public class Vowel
{
  public static void main(String [] args)
    {
      Scanner v=new Scanner(System.in);
      System.out.println("Enter a string : ");
      String s=v.nextLine();
      int i,count=0;
      int len=s.length();
      for(i=0;i<len;i++)
      {
         if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || 
                            s.charAt(i)=='u')
           {
             count=count+1;
            }
       }
       System.out.println("The total number of vowels in the entered string are : " + count);
    }
}
