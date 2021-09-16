import java.util.Scanner;
public class Insert
{
  public static void main(String [] args)
    {
          Scanner str1=new Scanner(System.in);
          System.out.println("Enter the string : ");
          String s1=str1.nextLine();
          System.out.println("Enter the striing to be inserted : ");
          Scanner str2=new Scanner(System.in);
          String s2=str2.nextLine();
          System.out.println("Enter the position where the other string is to be inserted : ");
          Scanner n=new Scanner(System.in);
          int p=n.nextInt();
          int len=s1.length();
          String s3="";
          for(int i=0;i<len;i++)
            {
                 if(i!=p)
                  {
                      s3=s3+s1.charAt(i);
                   }
                  else if(i==p)
                   {
                     s3=s3+" "+s2+" ";
                    }
              }
              System.out.println(s3);
      }
}
