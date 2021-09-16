class Rectangle
{
   double l=5.5;
   double b=6.0;
   
   void getNew(double len,double bre)
   {
       l=len;
       b=bre;
   }
   
   double area()
   {
      double ar;
      ar=l*b;
      return ar;
   }
  
   double perimeter()
   {
      double peri;
      peri=2*(l+b);
      return peri;
   }

   public static void main(String [] args)
   {
       Rectangle r=new Rectangle();
       double a=r.area();
       double p=r.perimeter();
       System.out.println("Area is : " + a);
       System.out.println("Perimeter is : " + p);
       r.getNew(10.0,12.0);
       double a1=r.area();
       double p1=r.perimeter();
       System.out.println("Area is : " + a1);
       System.out.println("Perimeter is : " + p1);
    }
}
