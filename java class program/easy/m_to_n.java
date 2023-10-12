import java.util.Scanner;

public class m_to_n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("M value: ");
        int m=s.nextInt();
        System.out.print("n value: ");
        int n=s.nextInt();
        int low = (m < n) ? m : n;
        int h= (n>m) ? n : m;
        for(int i=low;i<=h;i++){
            if(i%7!=0){
                System.out.print(i+" ");
            }
        }
        s.close();
    }}
    