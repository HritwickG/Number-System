/*Problem Statement: Find lcm of two numbers.

Examples:

Example 1:
Input: num1 = 4,num2 = 8
Output: 8


Example 2:
Input: num1 = 3,num2 = 6
Output: 6 */

import java.util.Scanner;

/**
 * FindLCMoftwonumbers
 */
public class FindLCMoftwonumbers {

    static int GCD(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return GCD(n2, (n1 % n2));
    }

    static void LCM(int n1, int n2) {
        int ans = n1 * n2 / GCD(n1, n2);
        System.out.println("LCM of two no is " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        LCM(n1, n2);
    }
}