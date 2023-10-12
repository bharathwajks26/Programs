import java.util.Scanner;

public class pat2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        for(int i=0;i<=r;i++){
            for(int j=0;j<i;j++){
            System.out.print(s);
            }
            s+=1;
            System.out.println(" ");
            
        }
        sc.close();
        


}}
