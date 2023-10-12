public class allnum {
    public static void main(String[] args) {
        // Find the sum of even numbers for the first 100 natural numbers
        int sumOfEvenNumbers = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += i;
            }
        }
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

        // Find the sum of odd numbers for the first 100 natural numbers
        int sumOfOddNumbers = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sumOfOddNumbers += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);

        // Find the sum of digits, reverse the digits, and check the first and last bit of a number
        int number = 12345;
        int sumOfDigits = 0;
        int reversedNumber = 0;
        int firstBit = 0;
        int lastBit = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        firstBit = reversedNumber % 10;
        lastBit = reversedNumber / (int) Math.pow(10, (int) Math.log10(reversedNumber));

        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Reversed number: " + reversedNumber);
        System.out.println("First bit: " + firstBit);
        System.out.println("Last bit: " + lastBit);

        // Print numbers from 100 to 900 that are divisible by 9
        System.out.println("Numbers from 100 to 900 divisible by 9:");
        for (int i = 100; i <= 900; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print prime numbers between 100 and 900
        System.out.println("Prime numbers between 100 and 900:");
        for (int i = 100; i <= 900; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
