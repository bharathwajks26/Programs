import java.util.Scanner;

public class Primecomps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        
        int[] num = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            num[i] = s.nextInt();
        }
        
        int p = 0;
        int compositeCount = 0;
        
        for (int n : num) {
		for (int i = 2; i <=n ; i++) {
            		if (n % i == 0) {
                		p++;
            		}
                
            	else {
                	c++;
            	}
        }
        
        System.out.println("Number of prime numbers: " + p);
        System.out.println("Number of composite numbers: " + c);
    }
    
    
}
}
