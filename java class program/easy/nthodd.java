public class nthodd {

  public static int findNthOddNumber(int n) {
    return n * n - 1;
  }

  public static void main(String[] args) {
    int n = 3;
    int result = findNthOddNumber(n);
    System.out.println("The 4th odd number after 4 odd numbers is " + result);
  }
}
