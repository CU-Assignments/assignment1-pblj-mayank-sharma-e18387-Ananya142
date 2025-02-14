import java.util.Scanner;

public class SimpleMatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];
        int[][] prod = new int[rows][cols];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Addition and Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                diff[i][j] = a[i][j] - b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(diff[i][j] + " ");
            System.out.println();
        }

        System.out.println("Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < cols; k++)
                    prod[i][j] += a[i][k] * b[k][j];
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
