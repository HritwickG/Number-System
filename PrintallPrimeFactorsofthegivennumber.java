/*Problem Statement: Given a number n. Print all Prime Factors of the given number n.

Examples:

Example 1:
Input: N = 12
Output: 2,2,3
Explanation: These are the prime factors of 12.

Example 2:
Input: N = 36
Output: 2,2,3,3
Explanation: These are the prime factors of 36.
 */

import java.util.Scanner;

public class PrintallPrimeFactorsofthegivennumber {
    static void factor(int n) {

        for (int i = 2; n > 1; i++) {

            if (n % i == 0) {

                while (n % i == 0) {

                    System.out.print(i + " ");
                    n = n / i;
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime fortorsof this num is");
        factor(n);
    }
}
