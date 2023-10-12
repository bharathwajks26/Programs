import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int[] d = {2000, 500, 200, 100};
        int[] notes = new int[d.length];

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the denomination (2000, 500, 200, or 100): ");
        int den = s.nextInt();

        boolean isValid = false;
        int Index = -1;

        
        for (int i = 0; i < d.length; i++) {
            if (den == d[i]) {
                isValid = true;
                Index = i;
                break;
            }
        }

        if (!isValid) {
            System.out.println("Invalid");
        } else {
        
            System.out.print("Enter the number of notes for denomination " + den + ": ");
            int numNotes = s.nextInt();

            
            notes[Index] = numNotes;

            int totalAmount = 0;

            for (int i = 0; i < d.length; i++) {
                totalAmount += d[i] * notes[i];
            }

            System.out.println("Total amount available in the ATM machine: " + totalAmount);
        }
    }
}
