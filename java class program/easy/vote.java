import java.util.*;

class vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter");
        int n = s.nextInt();
        if(n<18){
            System.out.printf("the person has %d year left",18-n);
        }
        else{
            System.out.println("ok");
        }
    s.close();
}}