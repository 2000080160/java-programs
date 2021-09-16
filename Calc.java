public class Calc
{
      public static void main(String [] args)
       {
         int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);
         System.out.println("The value of A is " + args[0] + " and B is " + args[1]);
         System.out.println("The result of A + B is " + (a+b));
         System.out.println("The result of A - B is " + (a-b));
         System.out.println("The result of A * B is " + (a*b));
         System.out.println("The result of A / B is " + (a/b));
         System.out.println("The result of A % B is " + (a%b));
       }
} 
