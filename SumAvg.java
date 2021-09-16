public class SumAvg
{
	public static void main(String[] args) {
	    int [] arr=new int[args.length];
	    int i=0;
	    for(String s:args){
	        arr[i]=Integer.parseInt(s);
	        i++;
	    }
	    int sum=0;
	    float avg;
	    for(i=0;i<arr.length;i++){
	        sum=sum+arr[i];
	    }
	    avg=(float)sum/arr.length;
	    System.out.println(sum);
	    System.out.println(avg);
	    
	}
}
