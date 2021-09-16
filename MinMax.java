public class MinMax
{
	public static void main(String[] args) {
	    int [] arr=new int[args.length];
	    int i=0;
	    for(String s:args){
	        arr[i]=Integer.parseInt(s);
	        i++;
	    }
	    int max=arr[0];
	    int min=arr[0];
	    for(i=0;i<arr.length;i++){
	        if (arr[i]>max){
	            max=arr[i];
	        }
	        else if (arr[i]<min){
	            min=arr[i];
	        }
	    }
	        
	    System.out.println("Maximum value in the array is : " + max);
	    System.out.println("Minimum value in the array is : " + min);
	    
	}
}
