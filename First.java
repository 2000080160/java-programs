class First
{
   int a=10;
   void disp()
     {
        System.out.println("Value of a is : " + a);
     } 
   void update(int n)
     {
        a=n;
     }
    public static void main(String [] args)
     {
         First f=new First();
         f.disp();
         f.update(50);
         f.disp();
     }
}
