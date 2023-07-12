package matrix;


public class MatrixTranspose {
    public static void main(String[] args) {
        System.out.println("Matrix M x N: ");
        int[][] matrix = generateMatrix(4, 6);
        print(matrix);
        System.out.println("Matrix NxM: ");
        int[][] anotherMatrix = transpose(matrix);
        print(anotherMatrix);
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


//Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

