import java.util.*;

class revnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter");
        int n = s.nextInt();
        s.close();
        int sum=0;
        for(int i=0;n>0;i++){
            int temp=n%10;
            sum=sum*10+temp;
            n/=10;
        }
        System.out.println("new "+sum);
        
    }}