/*
 * Problem Statement: Given two numbers. Find the greatest of two numbers.

Examples:

Example 1:
Input: 1 3
Output: 3
Explanation: Answer is 3,since 3 is greater than 1.

Input: 1.123  1.124
Output: 1.124
Explanation: Answer is 1.124,since 1.124 is greater than 1.123.
 */

import java.util.Scanner;

public class Greatestoftwonumbers {
    static void Find(int x, int y) {
        // if (x > y) {
        // System.out.println("Greatest no is" + x);
        // } else if (x == y) {
        // System.out.println("It is a equl no");
        // } else
        // System.out.println("Gretest no is " + y);
        System.out.println("Greatest no is" + Math.max(x, y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Find(x, y);
    }
}
