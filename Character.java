public class Character
{
	public static void main(String[] args) {
		char c1,c2;
		c1=args[0].charAt(0);
		c2=args[1].charAt(0);
		if (c1>c2)
                 System.out.println(c2 + "," +c1);
                else
                  System.out.println(c1 + "," +c2);
	}
}
