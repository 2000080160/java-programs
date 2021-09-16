public class InsertElement
{
	public static void main(String[] args) {
	    int i;
		int [] arr=new int[10];
                for(i=0;i<9;i++)
                {
                   arr[i]=i;
                }

		int n=Integer.parseInt(args[0]);
		int p=Integer.parseInt(args[1]);
		if (p>arr.length)
		System.out.println("Invalid Input");
	else
	{
		for(i=arr.length-2;i>=p;i--)
		arr[i+1]=arr[i];
		arr[p]=n;
		System.out.println("After inserting the element array is :");
		for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	}
}
