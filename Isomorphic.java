import java.util.Scanner;
public class Isomorphic
{
    public static void main(String [] args)
     {
       Scanner obj=new Scanner(System.in);
       String str1,str2;
       int [] map1=new int[128];
       int [] map2=new int[128];
       for(int i=0;i<128;i++)
              map1[i]=map2[i]=-1;
       System.out.println("Enter two strings : ");
       str1=obj.nextLine();
       str2=obj.nextLine();
       int s1l=str1.length();
       int s2l=str2.length();
       if(s1l!=s2l)
        {
             System.out.println("Strings are not Isomorphic");
             return;
        }
        for(int i=0;i<s1l;i++)
         {
            char s1c=str1.charAt(i);
            char s2c=str2.charAt(i);
            if(map1[s1c]==-1 && map2[s2c]==-1)
              {
                 map1[s1c]=s2c;
                 map2[s2c]=s1c;
               }
            else
              {
                   if(map1[s1c]!=s2c || map2[s2c]!=s1c)
                     {
                        System.out.println("Strings are not Isomorphic");
                        return;
                     }
               }
          }
            System.out.println("Strings are Isomorphic");
        }
}
