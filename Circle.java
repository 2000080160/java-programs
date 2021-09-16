class Circle{
double radius;

Circle(double r)
{
radius=r;
}

double getArea()
{
 double area=3.14*radius*radius;
 return area;
}
double getCircumference()
{
  double circum=2*3.14*radius;
  return circum;
}
}
 
public class CircleMain
{
  public static void main(String [] args)
{
   Circle c=new Circle(10);
   double a=c.getArea();
   System.out.println("Area of the circle is : " + a);
   double cir=c.getCircumference();
   System.out.println("Circumference of the circle is : " + cir);
}
}
