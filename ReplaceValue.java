package oops_skill;
// Program to replace a value with a new value
import java.util.Scanner;
public class ReplaceValue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter old value to replace: ");
        int oldVal = sc.nextInt();
        System.out.print("Enter new value: ");
        int newVal = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }

        System.out.print("Updated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

