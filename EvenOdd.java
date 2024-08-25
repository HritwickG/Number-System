import java.util.Scanner;

public class EvenOdd {
    static void chk(int n) {
        if (n % 2 == 0)
            System.out.println("It is a Even No");
        else
            System.out.println("It is a Odd no");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chk(n);
    }
}
