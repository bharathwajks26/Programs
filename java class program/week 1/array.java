import java.util.Scanner;
import java.util.String;
public class array
{
public static void main(String[] args)
{
    Scanner input= new Scanner(System.in);
    System.out.println("enter size array");
    int n=input.nextInt();
    int[] x=new int[n];
    int i,j,temp;
    for(i=0;i<n;i++){
        x[i]=input.nextInt();
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(x[i]>x[j]){
                temp=x[i];
                x[i]=x[j];
                x[j]=temp;
            }
        }
    }
     for(i=0;i<n;i++){
        System.out.print(x[i]+" ");
    }
    
}
}

