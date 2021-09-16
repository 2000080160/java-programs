public class Bitwise
{
    public static void main(String [] args)
     {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a&b;
        int d=a|b;
        int e=a^b;
        System.out.println("Bitwise AND operator : " + c);
        System.out.println("Bitwise OR operator : " + d);
        System.out.println("Bitwise EXOR operator : " + e);
      }
}
