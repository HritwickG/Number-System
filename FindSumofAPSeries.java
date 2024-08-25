/*
 * Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

a = first term of A.P.

d= common Difference of A.P.

n= Number of Terms in  A.P.

Examples:

Example 1:
Input:
n=4
a=2
d=2
Output: 20
Explanation: 2+4+6+8 = 20
 */

import java.util.Scanner;

public class FindSumofAPSeries {
    static void AP(int n, int a, int d) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + a;
            a += d;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        AP(n, a, d);
    }
}
