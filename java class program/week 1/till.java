import java.util.Scanner;

public class till {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int n=0,es=0,os=0;
	int ec=0,oc=0;
	while(n!=-1){
	System.out.println("enter num ");
	n=scanner.nextInt();
	if(n==-1)
{ break;}
	if(n<0)
{
	ec++;
	es+=n;
}
	else
{
	oc++;
	os+=n;
}
}
if(ec!=0){
System.out.println("enter even ave "+(es/ec));}
else
{
System.out.println("enter -ve ave "+0);
}

System.out.println("enter +ve ave "+(os/oc));
}
}