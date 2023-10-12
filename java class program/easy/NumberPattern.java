public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; 
        int c = 1; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                int sq = c * c;
                System.out.print(sq + " ");
                c++; 
            }
            System.out.println(); 
        }
    }
}
