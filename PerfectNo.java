import java.util.Scanner;

public class PerfectNo {
    static void chk(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("It is a perfect no");
        } else
            System.out.println("It is not a perfect no");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chk(n);
    }
}
