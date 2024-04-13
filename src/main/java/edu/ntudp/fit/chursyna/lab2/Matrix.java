package edu.ntudp.fit.chursyna.lab2;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private static final int MAX_SIZE_MATRIX = 20;
    private static final int RANGE_RANDOM_NUMB = 100;

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[][] matrix;
        int columns, rows;
        do {
            System.out.println("Enter the number of columns (matrix width):");
            columns = Scan.nextInt();
            if (columns > MAX_SIZE_MATRIX) {
                System.out.println("The number of columns should not exceed " + MAX_SIZE_MATRIX);
            }
        } while (columns > MAX_SIZE_MATRIX);

        do {
            System.out.println("Enter the number of rows (matrix height):");
            rows = Scan.nextInt();
            if (rows > MAX_SIZE_MATRIX) {
                System.out.println("The number of rows should not exceed " + MAX_SIZE_MATRIX);
            }
        } while (rows > MAX_SIZE_MATRIX);

        System.out.println("Do you want to fill the matrix manually(1) or randomly(2)?");
        int choice = Scan.nextInt();

        if (choice == 1){
            System.out.println("Fill the matrix manually:");
            matrix = createManualMatrix(columns, rows, Scan);
        } else if (choice == 2) {
            System.out.println("Fill the matrix randomly:");
            matrix = createRandomMatrix(columns, rows);
        }
        else {
            System.out.println("Invalid choice. Try again.");
            return;
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        int min = findMinOfMatrixElements(matrix);
        int max = findMaxOfMatrixElements(matrix);
        double average = calculateAverageOfMatrixElements(matrix);
        double geometricmean = calculateGeometricMeanOfMatrixElements(matrix);

        System.out.println("Minimum matrix element = " + min);
        System.out.println("Maximum matrix element = " + max);
        System.out.println("Average of matrix elements = " + average);
        System.out.println("Geometric mean of matrix elements = " + geometricmean);
    }

    private static int[][] createManualMatrix (int columns, int rows, Scanner Scan) {
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Scan.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] createRandomMatrix (int columns, int rows) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(RANGE_RANDOM_NUMB);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMinOfMatrixElements(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    private static int findMaxOfMatrixElements(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static double calculateAverageOfMatrixElements(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return sum / count;
    }

    private static double calculateGeometricMeanOfMatrixElements(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                product *= element;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}
