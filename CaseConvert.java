public class CaseConvert
{
 public static void main(String [] args)
  {
       char c;
       c=args[0].charAt(0);
       int k=(int) c;
       if (c >='a' & c<='z')
       {
         k=k-32;
         System.out.println(args[0] + "---->" + (char)k);
       }
       else if (c>='A' & c<='Z')
       {
         k=k+32;
         System.out.println(args[0] + "---->" + (char)k);
       }
   }
}
