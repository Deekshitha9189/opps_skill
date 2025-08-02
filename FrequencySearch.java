package oops_skill;
// Program to search and display the number of times a given value is present in an array
import java.util.Scanner;
public class FrequencySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 7, 3, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int val = sc.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == val) count++;
        }
        System.out.println(val + " occurred " + count + " times.");
    }
}
