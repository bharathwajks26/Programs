import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
   int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
 for (int i = 0; i < size; i++) {
           a[i] = s.nextInt();
        }
    int count = 0;
        int[] unique = new int[a.length];

for (int i = 0; i < a.length; i++) {
            boolean isdu = false;
  for (int j = 0; j < count; j++) {
          if (a[i] == unique[j]) {
                isdu = true;
                    break;
                }  }
    if (!isdu) {
              unique[count++] = a[i];
            }  }
int[] f = new int[count];
        for (int i = 0; i < count; i++) {
            f[i] = unique[i];
        }
        System.out.println("New Array:");
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }
    }
}
