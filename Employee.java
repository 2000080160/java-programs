class Employee{  
int id;
String name;  
int salary;
void setId(int no){  
id = no;
}
void setName(String n){  
name = n;
}
void setSalary(int s){  
salary = s;
}
void getEmployeeDetails(){  
System.out.println(name + " salary is "+ salary);
}
}
public class EmployeeDemo {
public static void main(String[] args) {  
Employee emp1 = new Employee();  
emp1.setId(101);
emp1.setName("John");  
emp1.setSalary(12000);  
emp1.getEmployeeDetails();
}
}
