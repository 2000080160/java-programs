import java.util.Scanner;
public class Unique
{
   public static void main(String [] args)
    {
      Scanner str=new Scanner(System.in);
      String s=str.nextLine();
      String word="";
       for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)==' ' || s.charAt(i)=='.')
             {
                 int f=s.indexOf(word);
                 int l=s.lastIndexOf(word);
                 if(f==l)
                 {
                   System.out.println(word);
                  }
                 word=new String();
                 
              }

             else
                 {
                    word=word+s.charAt(i);
                 }
          }   
      }
}
