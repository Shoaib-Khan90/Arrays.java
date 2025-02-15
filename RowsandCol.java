package Array;

import java.util.Scanner;

public class RowsandCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
        // Taking rows and columns as input
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Declaring the 2D array
        int[][] num = new int[rows][cols];

        // Taking array input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {  // Changed 'i <= rows' to 'i < rows'
            for (int j = 0; j < cols; j++) {  // Changed 'j <= cols' to 'j < cols'
                num[i][j] = input.nextInt();
            }
        }

        // Displaying the array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {  // Changed 'i <= rows' to 'i < rows'
            for (int j = 0; j < cols; j++) {  // Changed 'j <= cols' to 'j < cols'
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // Move to the next line for better formatting
        }

        input.close(); // Close Scanner to prevent resource leak
	}

}
