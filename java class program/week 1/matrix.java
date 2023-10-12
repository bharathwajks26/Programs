import java.util.Scanner;
class matrix{
public static void main(String args[])
{
int r,c,sum=0;
Scanner scanner=new Scanner(System.in);
r=scanner.nextInt();
c=scanner.nextInt();
int[][] array1=new int[r][c];
int[][] array2=new int[r][c];
int[][] add=new int[r][c];
int[][] sub=new int[r][c];
int[][] trans=new int[r][c];
int[][] mul=new int[r][c];

System.out.println("first matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
array1[i][j]=scanner.nextInt();
}
}
System.out.println("second matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
array2[i][j]=scanner.nextInt();
}
}
System.out.println(" 1 ");
int x=scanner.nextInt();

switch(x){
case 1:
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
add[i][j]=array1[i][j]+array2[i][j];
}
}
System.out.println("Addition");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(add[i][j]+" ");
}
System.out.println(" ");
}
break;

case 2:
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
sub[i][j]=array1[i][j]-array2[i][j];
}
}


System.out.println("Substraction");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(sub[i][j]+" ");
}
System.out.println(" ");
}
break;

case 3:
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
trans[i][j]=array1[j][i];
}
}

System.out.println("transpose of first matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(trans[i][j]+" ");
}
System.out.println(" ");
}

break;

case 4:
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(i==j)
{
sum=sum+array1[i][j];
}
}
}

System.out.println("diagnol sum of first matrix:"+sum);
break;

case 5:
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
for(int k=0;k<c;k++)
{
mul[i][j]+=array1[i][k]*array2[k][j];
}
}
}

System.out.println("multiplication");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println(" ");
}
break;

}






}
}