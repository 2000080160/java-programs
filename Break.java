public class Break
{
	public static void main(String[] args) {
	    int sum=0;
		for(String i:args){
		    int j=Integer.parseInt(i);
		    if (j<0){
		        break;
		    }
		    sum=sum+j;
	}
	System.out.println(sum);
}
}
