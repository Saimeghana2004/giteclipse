package PracticePrograms;

public class MatrixExample {
	
	//method to print a matrix
	
	public static void printMatrix(int[][] matrix) {
		for(int[]row:matrix) {
			for(int[]val:matrix) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args, int[][] matrix) {
		// TODO Auto-generated method stub
		System.out.println("Original Matrix");
		printMatrix(matrix);
		

	}

}
