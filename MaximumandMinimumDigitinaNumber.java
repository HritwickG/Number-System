/*Maximum and Minimum Digit in a Number


1

0
Problem Statement: Given a number N, print the smallest and largest digits present in the number.

Examples:

Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.

Example 2:
Input: N = 23004
Output: Largest digit : 4
        Smallest digit : 0
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number. */

import java.util.Scanner;

public class MaximumandMinimumDigitinaNumber {
    static void find(int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
            n /= 10;
        }
        System.out.println("Max num is " + max);
        System.out.println("Min no is " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        find(n);

    }
}
