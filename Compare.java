public class Compare
{
  public static void main(String [] args)
     {
        String str1 = "Abcd";
      String str2 = new String("abc");
      String str3 = new String("abcd");
      
      int result = str1.compareTo( str2 );
      System.out.println(result);
      
      result = str2.compareTo( str3 );
      System.out.println(result);
    }
}
