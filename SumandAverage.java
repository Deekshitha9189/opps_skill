package oops_skill;
// Program to find the sum and average of array values
public class SumandAverage {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
