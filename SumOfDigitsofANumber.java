// Problem Statement: Given an integer, find the sum of digits of that integer.

// Examples:

// Example 1:
// Input: N = 472
// Output: 13
// Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

// Example 2:
// Input: N = 102
// Output: 3
// Explanation: The digits in the number are 0, 1, and 2. Summing them up gives us a value of 3

import java.util.Scanner;

public class SumOfDigitsofANumber {
    static void sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        System.out.println("Sum of the interger is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);

    }
}
