// Check if a number is Palindrome or Not
// Problem Statement:  Given a number check if it is a palindrome.

import java.util.Scanner;

public class Pallindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int temp = n;

        while (n > 0) {
            int digit = n % 10;

            x = x * 10 + digit;

            n = n / 10;

        }
        if (x == temp) {
            System.out.println("It is a pallindrom no");
        } else {
            System.out.println("It is not a pallindrom no");
        }

    }
}