import java.util.Scanner;
public class Alphabets
{
    public static void main(String [] args)
     {
       System.out.println("Enter the String : ");
       Scanner str=new Scanner(System.in);
       String s=str.nextLine();
       String a="abcdefghijklmnopqrstuvwxyz";
       int flag=0;
       for(int i=0;i<26;i++)
       {
         char ch=a.charAt(i);
         if(s.indexOf(ch)==-1)
          {
             
            System.out.println("False");
            flag=1;
            break;
          }
        }
        if(flag==0)
         System.out.println("The string contains all the 26 alphabets");
        else
          System.out.println("The string does not have all the 26 alphabets");
 
        }
}
