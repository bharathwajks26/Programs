import java.util.*;

public class Employee {
    public static void main(String[] args) {

Scanner s= new Scanner(System.in);
Emp obj=new Emp();

System.out.println("Enter ename");
String ename=s.nextLine();

System.out.println("enter eno");
int eno=s.nextInt();

System.out.println("basicpay");
double base=s.nextDouble();
obj.ns(base);
obj.gs(base);

}}
class Emp{
public void ns(double base){
	double net=base+(base*0.10)+(base*0.20)+(base*0.15);
	System.out.println("netsalary"+net);
	
}
public void gs(double base){
	double net=base+(base*0.10)+(base*0.20)+(base*0.15);	
	double de=base-(base*0.12)-(base*0.20);
	double gross=net-de;
	System.out.println("gross salary"+gross);
}}