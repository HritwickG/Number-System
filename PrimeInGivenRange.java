import java.util.Scanner;

public class PrimeInGivenRange {
    static boolean chk(int n) {
        if (n <= 1)
            return false;

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (chk(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
