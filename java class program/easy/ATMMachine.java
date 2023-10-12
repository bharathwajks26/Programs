import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] denominations = {2000, 500, 200, 100};
        int[] notes = new int[4];
        int total = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            int denomination = sc.nextInt();
            
            // Check if the entered denomination is valid
            boolean isValid = false;
            for (int d : denominations) {
                if (d == denomination) {
                    isValid = true;
                    break;
                }
            }
            
            if (!isValid) {
                System.out.println("Invalid denomination entered.");
                return;
            }

            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            int note = sc.nextInt();
            
            notes[i] = note;
            total += denomination * note;
        }

        System.out.println("Total Available Balance in ATM: " + total);
        sc.close();
    }
}
