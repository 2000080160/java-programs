import java.util.Scanner;
public class LastWord
{
  public static void main(String [] args)
    {
      Scanner str=new Scanner(System.in);
      System.out.println("Enter a string : ");
      String s=str.nextLine();
      String [] word=s.split("\\s");
      if(word.length<=1)
       {
           System.out.println("The length of the last word in the string is : " + s.trim().length());
        }
          String last=word[word.length-1];
         System.out.println("Length of the last word in the string is : " + last.length());
     }
}
