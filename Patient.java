class Patient{  
String name;
double weight;  
double height;
Patient(String name,double weight,double height)
{
  this.name=name;
  this.weight=weight;
  this.height=height;
}
double getBMI()
{
    double BMI=(weight/(height*height))*703;
    return BMI;
}
}
public class Patients{
public static void main(String[] args) {  
Patient p=new Patient("Kavya",450,120);   
double value=p.getBMI();
System.out.println("BMI is : " + value);
}
}
