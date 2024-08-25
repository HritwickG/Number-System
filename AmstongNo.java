// Example 1:
// Input:153 
// Output: Yes, it is an Armstrong Number
// Explanation: 1^3 + 5^3 + 3^3 = 153

// Input:170 
// Output: No, it is not an Armstrong Number
// Explanation: 1^3 + 7^3 + 0^3 != 170
import java.util.*;

class AmstongNo {
    static void chk(int n) {
        String str = Integer.toString((n));
        int size = str.length();
        int temp = n;
        int num = 0;
        if (n % 10 == 0) {
            System.err.println("It is not a Amstrong No");
        }

        while (temp > 0) {
            int digit = temp % 10;
            int x = (int) Math.pow(digit, size);
            num += Math.pow(digit, size);
            temp /= 10;
        }
        // while (temp > 0) {
        // int digit = temp % 10;
        // num += Math.pow(digit, size);
        // temp /= 10;
        // }
        if (n == num)
            System.err.println("It is a Amstrong No");
        else
            System.err.println("It is not a Amstrong No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        chk(x);
    }
}