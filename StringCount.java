import java.util.Scanner;
public class StringCount
{
   public static void main(String [] args)
    {
       Scanner str=new Scanner(System.in);
       System.out.println("Enter your email id : ");
       String s=str.nextLine();
       int len=s.length();
       int dcount=0,scount=0,lcount=0,ucount=0,dotcount=0,chcount=0;
       for(int i=0;i<len;i++)
       {
          if (s.charAt(i)>='0' && s.charAt(i)<='9')
            {
               dcount=dcount+1;
             }

          else if(s.charAt(i)==' ')
             scount+=1;
          else if(s.charAt(i)>='a' && s.charAt(i)<='z')
              lcount+=1;
          else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
             ucount+=1;
          else if(s.charAt(i)=='.')
             dotcount+=1;
          else
            chcount+=1;
           
        }
          System.out.println("Number of digits in the entered string are : " + dcount);
          System.out.println("Number of spaces in the entered string are : " + scount);
          System.out.println("Number of lowercase alphabets in the entered string are : " + lcount);
          System.out.println("Number of uppercase alphabets in the entered string are : " + ucount);
          System.out.println("Number of dots in the entered string are : " + dotcount);
          System.out.println("Number of special characters in the entered string are : " + chcount);
     }
}
