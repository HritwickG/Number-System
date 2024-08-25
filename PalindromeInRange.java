// Find all Palindrome Numbers in a given range

// Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

// Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552
import java.util.Scanner;

/**
 * PalindromeInRange
 */
public class PalindromeInRange {

    static boolean ispalindrom(int n) {
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (n == reverse) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = min; i <= max; i++) {
            if (ispalindrom(i)) {
                System.out.print(i + " ");
            }

        }

    }
}