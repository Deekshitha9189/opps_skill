package oops_skill;
// Program to find the biggest and smallest values in an array
public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 89, 33};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
