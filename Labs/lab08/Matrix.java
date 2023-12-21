import javax.swing.JOptionPane;

/**
 * Program name: Matrix
 * Allows the user to create a randomly generated matrix, display it, multiply
 * it by a number, and check whether is symmetric.
 * 
 * @author Enrique Saracho Felix
 * @since July 8, 2023
 * 
 */
public class Matrix {
    /**
     * main: Prompts the user to choose an option from a menu and calls other
     * methods accordingly to get a response to the user.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int userInput = 0;
        double[][] matrix = new double[0][0];

        while (userInput != 6) {
            userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "M is a matrix with random positive double values less than 100.\nChoose one of the following options to resume the program:\n\n1 : Create M\n2 : Display M\n3 : Square M\n4 : Multiply M with a coefficient\n5 : Check whether M is symmetric\n6 : Quit the program\n\n"));

            switch (userInput) {
                case 1:
                    int m = Integer
                            .parseInt(
                                    JOptionPane.showInputDialog(null, "Enter a positive integer as matrix dimension:"));
                    matrix = genMatrix(m);
                    break;
                case 2:
                    if (matrix.length == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid option: There is no matrix to show.\nCreate a matrix first.");
                    } else {
                        printMatrix(matrix);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Option not available.");
                    break;
                case 4:
                    if (matrix.length == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid option: There is no matrix to show.\nCreate a matrix first.");
                    } else {
                        int c = Integer.parseInt(
                                JOptionPane.showInputDialog(null, "Enter a coefficient to multiply the matrix with:"));
                        double[][] matrix1 = Multiply(c, matrix);
                        printMatrix(matrix1);
                    }
                    break;
                case 5:
                    if (matrix.length == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid option: There is no matrix to show.\nCreate a matrix first.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "The matrix M is " + (isSymmetric(matrix) ? "" : "not ") + "symmetric");
                    }
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input: Choose a number from 1 to 6.");
                    break;

            }
        }

    }

    /**
     * genMatrix: generates a matrix of random double values, with m number of rows
     * and
     * columns.
     * 
     * @param m An integer value representing the number of rows and columns
     *          specified by the user.
     * @return the matrix of random double values generated.
     */
    public static double[][] genMatrix(int m) {
        double[][] matrix = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (Math.random() * 100);
            }
        }
        return matrix;
    }

    /**
     * printMatrix: Takes a matrix as an argument and prints it.
     * 
     * @param matrix A matrix of double values.
     * 
     *               precondition: The matrix argument could either be the randomly
     *               generated matrix from genMatrix() method, or the return of the
     *               Multiply() method.
     */
    public static void printMatrix(double[][] matrix) {
        int m = matrix.length;
        String elements = "";
        for (int i = 0; i < m; i++) {
            for (double element : matrix[i]) {
                elements += String.format(" %5.2f ", element);
            }
            elements += "\n";
        }
        JOptionPane.showMessageDialog(null,
                String.format("The matrix of size %d by %d is:\n%s", m,
                        m, elements));
    }

    /**
     * isSymetric: check whether the matrix is symmetric.
     * 
     * @param matrix A matrix of double values.
     * @return A boolean value, 'true' if the matrix is symmetric, 'false' if it
     *         isn't.
     */
    public static boolean isSymmetric(double[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Multiply: multiplies every double value in a matrix by a coefficient c.
     * 
     * @param c       An integer value to be the coefficient.
     * @param matrix1 The matrix of double values to be multiplied.
     * @return The resulting matrix of double values.
     */
    public static double[][] Multiply(double c, double[][] matrix1) {
        int m = matrix1.length;
        double[][] matrix = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = c * matrix1[i][j];
            }
        }
        return matrix;
    }
}
