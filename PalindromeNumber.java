package oops_skill;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), rev = 0, temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n == rev)
            System.out.println(n + " is a Palindrome Number");
        else
            System.out.println(n + " is not a Palindrome Number");
        sc.close();
    }
}

