import java.util.Scanner;

public class CalculatethePowerofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double power = Math.pow(n1, n2);
        System.out.println(power);
    }
}
