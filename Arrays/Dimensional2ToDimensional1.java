import java.util.Scanner;

public class Dimensional2ToDimensional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        
        System.out.print("Enter number of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        int index = 0;

        System.out.println("Enter the elements of the matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array elements :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
