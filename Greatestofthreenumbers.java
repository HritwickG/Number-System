import java.util.Scanner;

public class Greatestofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.println("Gretest no is" + Math.max(x, +Math.max(y, z)));
    }
}
