/*Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

Examples:

Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Example 2:
Input: N=6,r = 4.
Output: 360 */

import java.util.Scanner;

public class PermutationsinwhichNpeoplecanoccupyRseats {

    static int factorial(int n) {
        int sum = 1;
        if (n == 0) {
            sum = 1;
            return sum;
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }

            return sum;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int prb = factorial(n) / factorial(n - r);
        System.out.println(prb);
    }
}
