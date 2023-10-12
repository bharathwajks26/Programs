import java.util.*;

class new1{
    public static void main(String args[]){
       sort obj = new sort();
       obj.sortarray();
       obj.small();
    }
}
class sort{
    int[] a;
        Scanner s=new Scanner(System.in);
        int n;
    
    public void sortarray(){
        System.out.println("total? ");
        n= s.nextInt();
        a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        } 
    
    for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    System.out.println("Sorted numbers: ");    
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
        }
    }
    public void small(){
        int low=a[0];
        System.out.println("Smallest "+low);
    } 
}
