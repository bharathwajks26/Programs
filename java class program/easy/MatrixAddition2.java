import java.util.Scanner;

public class MatrixAddition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the matrices (rows cols):");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];                
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(result[i][j]+" ");                
            }
            System.out.println(" ");

    }
    scanner.close();
}}