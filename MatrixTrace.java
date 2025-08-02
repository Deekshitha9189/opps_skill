package oops_skill;
// Program to find the trace of a given matrix
public class MatrixTrace {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int trace = 0;

        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }

        System.out.println("Trace of the matrix = " + trace);
    }
}
