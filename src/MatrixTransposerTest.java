import java.util.Arrays;

public class MatrixTransposerTest {
    
    public static void main(String[] args) {
        // Тест 1: матриця 2x3 
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("\nВхідна матриця 1:");
        printMatrix(matrix1);
        
        int[][] transposed1 = MatrixTransposer.transpose(matrix1);
        System.out.println("\nТранспортована матриця 1:");
        printMatrix(transposed1);
        
        // Тест 2: матриця 3x2
        int[][] matrix2 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        System.out.println("\nВхідна матриця 2:");
        printMatrix(matrix2);
        
        int[][] transposed2 = MatrixTransposer.transpose(matrix2);
        System.out.println("\nТранспортована матриця 2:");
        printMatrix(transposed2);
        
        // Тест 3: Пуста матриця
        try {
            MatrixTransposer.transpose(new int[0][0]);
        } catch (IllegalArgumentException e) {
            System.out.println("\nТест 3 - Виняток: " + e.getMessage());
        }
    }
    
    /**
     * Вивід матриці в людський формат
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
} 