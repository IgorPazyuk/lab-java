import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        Random rand = new Random();

        System.out.println("Матриця 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = rand.nextDouble();
                System.out.printf("%.4f\t", matrix[i][j]);
            }
            System.out.println();
        }

        double det = determinant3x3(matrix);
        System.out.printf("Визначник матриці: %.6f\n", det);
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }
}
