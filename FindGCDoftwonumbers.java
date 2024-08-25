/*Example 1:
Input:
 num1 = 4, num2 = 8
Output:
 4
Explanation:
 Since 4 is the greatest number which divides both num1 and num2.
 */

import java.util.Scanner;

public class FindGCDoftwonumbers {
    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, (n1 % n2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));
    }
}
