import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N value: ");
        int n = s.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            for (int k=0; k<n+1-i ;k++){
                System.out.print("*");
            }
        System.out.println("");
        }
        s.close();
    }}