import java.util.Scanner;

public class PositiveNegetiveNo {
    static void chk(int n) {
        if (n > 0) {
            System.out.println("It is a positive no");
        } else
            System.out.println("It is a Negetive No");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chk(n);
    }
}
