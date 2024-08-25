/*
 * Problem Statement: Given an integer. Write a program to reverse digits of a number.

Examples:

Example 1:
Input: N = 472
Output: 274
Explanation: Reading the number from back to front, we see that the output should be 274

Example 2:
Input: N = 470
Output: 74
Explanation: Reading the number from back to front, we get 074. For an integer with no decimals, we know that leading zeros have no significance and therefore our answer should be 74
 */

import java.util.Scanner;

/**
 * Reversedigitsofanumber
 */
public class Reversedigitsofanumber {

    static void reverse(int n) {
        int temp = 0;

        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversse no is " + temp);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
}