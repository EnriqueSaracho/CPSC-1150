import java.util.Scanner;
public class TwoDArrayExamples{
	public static void main(String[] args){
		/*int [][] theMatrix = getMatrix(3,4);
		print2DArray(theMatrix); 
		// Display sum of elements
    	System.out.println("\nSum of all elements is " + sum(theMatrix));
    	System.out.println("\nSum of each column is ");
    	printArray(sumByCol(theMatrix));

    	System.out.println("\nThe shuffeled matrix is");
    	shuffle(theMatrix);
    	print2DArray(theMatrix); */

    	boolean [] arr = new boolean [10];
        for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();	
	}
	/*
	** intialize an integer 2D array with random non-negative integers less than 100
	** @param row is number of elemnts in each row
	** @param col is number of elemnts in each column
	** @return 2D-Array that represents the generated matrix
	**
	**/
	public static int[][] genMatrix(int row, int col) {
		// initialize array values
		int[][] m = new int[row][col];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = (int) (Math.random()*100);
		return m;
	}

	/*
	** intialize an integer 2D array with input values
	** @param row is number of elemnts in each row
	** @param col is number of elemnts in each column
	** @return 2D-Array that represents the input matrix
	**
	**/
	public static int [][] getMatrix(int row, int col) {
		int [][] matrix = new int[row][col];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " + 
									matrix[0].length + " columns: ");
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextInt();
		input.close();
		return matrix;
	}

	/*
	** Prints an integer array
	** @param arr is an integer array
	** @return none
	**
	**/
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
		return;
	} 
	/*
	** Prints an integer 2D array
	** @param matrix is an integer 2D array
	** @return none
	**
	**/
	public static void print2DArray(int [][] matrix) {
		for (int row = 0; row < matrix.length; row++){ 
			for (int column = 0; column < matrix[row].length; column++) 
				System.out.print(matrix[row][column] + " ");
			System.out.println();
		}	
		return;
	} 
	
	/*
	** Summing all the elements in an integer 2D array
	** @param m is an integer 2D array
	** @return int represents the summation of all elements
	**
	**/
	public static int sum (int[][] m) {
	    int total = 0;
	    for (int row = 0; row < m.length; row++) {
	      for (int column = 0; column < m[row].length; column++) {
	        total += m[row][column];
	      }
	    }
	    return total;
	}
	
	/*
	** Summing elements by column in an integer 2D array
	** @param matrix is an integer 2D array
	** @return int[] where each element represents the sum of each column
	**
	**/
	public static int[] sumByCol(int[][] matrix) {
	    int[] total = new int[matrix[0].length];
	    for (int column = 0; column < matrix[0].length; column++) {
			for (int row = 0; row < matrix.length; row++)
				total[column] += matrix[row][column];
	    }
	    return total;
	}

	/*
	** Random shuffling of an integer 2D array
	** @param matrix is an integer 2D array
	** @return none
	**
	**/
	public static void shuffle(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) 
  			for (int j = 0; j < matrix[i].length; j++) {
    			int i1 = (int)(Math.random() * matrix.length);
    			int j1 = (int)(Math.random() * matrix[i].length);
    			// Swap matrix[i][j] with matrix[i1][j1]
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[i1][j1]; 
    			matrix[i1][j1] = temp;
  			}
	}

}