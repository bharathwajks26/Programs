import java.util.Scanner;

public class pat1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the symbol to use: ");
        int s = sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        for(int i=0;i<=r;i++){
            System.out.println(" ");
            for(int j=0;j<i;j++){
            System.out.print(s);
            }
            
        }
        for(int j=0;j<r;j++){
            System.out.println(" ");
            for(int i=r-j-1;i>0;i--){
            System.out.print(s);
        }
        }sc.close();


}}
