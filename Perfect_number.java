// Perfect number check
package oops_skill;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String args[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (n == sum) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is NOT a Perfect Number");
        }

        sc.close(); // optional but good practice
    }
}
