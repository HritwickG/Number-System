import java.util.Scanner;

public class ProgramtofindSumofGPSeries {
    static void sum(int a, int d, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + a;
            a = a * d;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        sum(a, d, n);

    }
}
