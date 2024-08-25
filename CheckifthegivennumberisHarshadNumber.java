/*Get 1:1 Mentorship


Login

Check if the given number is Harshad(Or Niven) Number


0

0
Problem Statement: Check if the number is a Harshad(or Niven) number or not.

Examples:

Example 1:
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Example 2:
Input: 379
Output: No
 it is not a Harshad number.
Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number. */

import java.util.Scanner;

public class CheckifthegivennumberisHarshadNumber {
    static void chk(int n) {
        int ans = 0;
        int temp = n;
        while (temp > 0) {
            ans = ans + temp % 10;
            temp /= 10;
        }
        System.out.println(ans);
        if (n % ans == 0) {
            System.out.println("It is harshad no");
        } else
            System.out.println("It is not a Harshad No ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chk(n);
    }
}
