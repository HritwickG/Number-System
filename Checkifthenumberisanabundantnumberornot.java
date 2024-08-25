/*Problem Statement: Check if the number is an abundant number or not.

Examples:

Example 1:
Input: 18
Output: Abundant Number
Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

Example 2:
Input: 21
Output: Not Abundant Number
Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant number. */

import java.util.Scanner;

public class Checkifthenumberisanabundantnumberornot {
    static void factor(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if (sum > n) {
            System.out.println("It is a anabundant Num ");
        } else
            System.out.println("It is not anabundant Num ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);
    }
}
