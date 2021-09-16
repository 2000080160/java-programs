public class FindArguments
{
    public static void main(String [] args)
     {
        int i;
        System.out.println("The Number of arguments are : " + args.length);
        System.out.println("The following arguments are : ");
        for(i=0;i<args.length;i++)
        System.out.println(i+1 + " " + args[i]);
        
      }
}
