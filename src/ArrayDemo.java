import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		//averageMarks();
		irregularArray();
		//addTwoMatrices(); // This one is "my" problem
		//varArgs(1, 3, 5, 7, 2, 11, 15, 29, 21, 43, 62, 0, -1);
		//multiplyTwoMatrices();

	}
	
	public static void averageMarks() {
		Scanner userInput = new Scanner(System.in);
		double sum = 0;
		double currentMark = 0;
				
		// Get the number of marks the user desires
		System.out.println("How many marks would you like to enter?");
		int numMarks = userInput.nextInt();
		double[] marks = new double[numMarks];


		// Get the user to enter each mark
		for(int i = 0; i < marks.length; i++) {
			// Catch for negative numbers
			do {
				System.out.println("Please enter your mark: ");
				currentMark = userInput.nextDouble();
				
				if(currentMark < 0 ) {
					System.out.println("Please enter a positive number");
				} else {
					marks[i] = currentMark;	
				}
				
			} while (currentMark < 0.0);
		}
		
		// Get the sum of all the marks
		for(int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		
		// Print the average of the marks
		System.out.println("The average of the " + marks.length + " marks is: " + (sum / marks.length));
		userInput.close();
	}
	
	public static void irregularArray() {
		int[][] irregular = { {1, 2, 3, 4}, {4, 5, 6, 7}, { } };
		
		System.out.println("An irregular array has different numbers of rows and columns");
		System.out.println("Below is a visual representation of an irregular array");
		System.out.println("\tCol1\tCol2\tCol3\tCol4");
		
		// Print the irregular array
		for(int row = 0; row < irregular.length; row++) {
			System.out.print("Row" + (row + 1) + "\t");
			for(int col = 0; col < irregular[row].length; col++) {
				System.out.print(irregular[row][col] + "\t");
			}
			System.out.println();
		}

	}
	
	public static void addTwoMatrices() {
		// Set up each matrix
		int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		int[][] matrix2 = { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} };
		int[][] sumOfMatrices =  new int[3][3];
		
		// Iterate through each row and add values together
		for(int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix2.length; col++) { 
				sumOfMatrices[row][col] = (matrix1[row][col] + matrix2[row][col]);
				System.out.print(sumOfMatrices[row][col] + " ");
			}
			System.out.println();
		}	
	}
	
	public static void varArgs(int ...userArgs) {
		// Print all of the user's inputs
		for(int i = 0; i < userArgs.length; i++) {
			System.out.print(userArgs[i] + " ");
		}
	}
	
	public static void multiplyTwoMatrices() {
		// Set up each matrix
		int[][] matrix1 = { {1, 2}, {3, 4 } };
		int[][] matrix2 = { {5, 6}, {7, 8 } };
		int[][] productOfMatrices =  new int[2][2];

		// Iterate and perform multiplication through the two matrices
		for(int row = 0; row < matrix1.length; row++) {		
			for (int col = 0; col < matrix1.length; col++) { 
				productOfMatrices[row][col] = 0;
				for(int i = 0; i < matrix1.length; i++) {
					productOfMatrices[row][col] += matrix1[row][i] * matrix2[i][col];
				}
				System.out.print(productOfMatrices[row][col] + " ");
			}
			System.out.println();
		}	
	}
	
}
