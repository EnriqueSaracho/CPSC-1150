import java.util.Scanner;
public class ArrayExamples{
	public static void main(String[] args){
		double[] myList = new double[5];
		Scanner input = new Scanner(System.in);
		//initializing array with user input
		System.out.print("Enter " + myList.length + " values: ");
		for (int i=0; i < myList.length; ++i)
			myList[i] = input.nextDouble();

		// displaying arrays
		System.out.print("User input array is ");
		for (int i=0; i < myList.length; ++i)
			System.out.printf("%7.2f, ", myList[i]);
		System.out.println();

		//initializing array with random non-negative values less than 100 
		for (int i=0; i < myList.length; ++i)
			myList[i] = Math.random() * 100;

		// displaying arrays
		System.out.print("Random array is ");
		for (int i=0; i < myList.length; ++i)
			System.out.printf("%7.2f, ", myList[i]);
		System.out.println();

		//summing all elements
		double total = 0; 
		for (int i=0; i < myList.length; ++i)
			total += myList[i];
		System.out.printf("Total sum of random array is %7.2f " , total);


		input.close();
	}
}