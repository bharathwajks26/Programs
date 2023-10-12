import java.util.Scanner;

public class salbonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter salary ");
        int sal = s.nextInt();
	
	System.out.print("1.Grade A\n2.Grade B ");
	int g=s.nextInt();
	int e=0;
	if(g==1)
	{
		System.out.println("Bonus"+(sal*5/100));
	}
	else{
		System.out.println("Bonus"+(sal*10/100));
	}
	if(sal<=10000)
	{
		e=sal*2/100;
		System.out.println("Additional "+e);
		
	}
	
	System.out.println("bon "+(e+sal*5/100));
System.out.println("salary "+(e+sal*5/100+sal));
}}