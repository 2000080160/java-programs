class Box{  
double length;
double breadth;  
double height;
void setLength(double l){  
length=l;
}
void setBreadth(double b){  
breadth=b;
}
void setHeight(double h){  
height=h;
}
void getVolume(){  
System.out.println("Volume of the Box is : "+(length*breadth*height));
}
}
public class BoxMain {
public static void main(String[] args) {  
Box b=new Box();  
b.setLength(13);
b.setBreadth(12);  
b.setHeight(11);  
b.getVolume();
}
}
