import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixTransposer {
    
    /**
     * Транспортування матриці. Зміна рядків та стовпців місцями
     *
     * @param matrix 
     * @return 
     * @throws IllegalArgumentException 
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матриця не може бути пустою");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Створення нової транспонованої матриці
        int[][] transposed = new int[cols][rows];
        
        // Транспортування використовуючи Arrays.stream
        IntStream.range(0, rows).forEach(i -> 
            IntStream.range(0, cols).forEach(j -> 
                transposed[j][i] = matrix[i][j]
            )
        );
        
        return transposed;
    }
} 