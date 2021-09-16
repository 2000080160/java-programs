public class Palindrome
{
	public static void main(String[] args) {
                int rem,number=0,temp;
                int n=Integer.parseInt(args[0]);
                temp=n;
		while (temp>0){
		    rem=temp%10;
		    number=(number*10)+rem;
		    temp=temp/10;
		}
		if (number==n)
                  System.out.println(n + " is a palindrome");
                else
                   System.out.println(n + " is not a palindrome");
	}
}
