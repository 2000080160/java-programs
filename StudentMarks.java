import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StudentMarks
{
   public static void main(String [] args) throws IOException
    {
       int i=0;
       System.out.println("Enter Student name : ");
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader reader=new BufferedReader(isr);
       String name=reader.readLine();
       System.out.println("Enter the marks in five subjects : ");
       int [] arr=new int[5];
       for(i=0;i<5;i++)
       {
       String m=reader.readLine();
       arr[i]=Integer.parseInt(m);
       }
       int sum=0;
       float avg=0;
       for(i=0;i<5;i++)
       {
         sum=sum+arr[i];
       }
       avg=(float)sum/5;
      System.out.println("Name of the Student is  "+ name + " and average is : " + avg);
     }
}
