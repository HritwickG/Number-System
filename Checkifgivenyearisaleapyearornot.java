/*
 * In this post we will solve the problem "Check if given year is a leap year or not".

Problem Statement: Check if the given year is a leap year or not.

Examples:

Example 1:
Input: 1996
Output: Yes
Explanation: Since 1996 is a leap year answer is “Yes”.

Example 2:
Input: 2000
Output: Yes

Explanation: Since 2000 is a leap year answer is “Yes”.
 */

import java.util.Scanner;

public class Checkifgivenyearisaleapyearornot {
    static void chk(int n) {
        if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0)) {
            System.out.println("It is a leap year");
        } else
            System.out.println("It is not a leap year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chk(n);
    }
}
