/*Problem Statement: Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. 

Examples:

Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1

Example 2:
Input: X = 3
Output: 6
Explanation: 3!=3*2*1
 */

import java.util.Scanner;

public class FactorialofaNumber {
    // static int fact(int n) {

    // if (n == 0) {
    // // System.out.println("The factorial ofthe num is 1");
    // return 1;
    // } else {
    // return n * fact(n - 1);
    // }

    // }
    static void fact(int n) {
        int sum = 1;
        if (n == 0) {
            sum = 1;
            System.out.println(sum);
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }

            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
