/**
 * @author Nisarg Patel
 *
 */
import java.util.Arrays;


public class SelectionSort {

	public static void main(String[] args) {
		int input[] = { 25, 15, 5, 10, 0, 100, 30 };
		System.out.println("Input Array : "+Arrays.toString(input));

		System.out.print("Sorted Array : [");
		selectionSort(input);										
		System.out.print("] \n");
	}
	

	public static void selectionSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int smallestNumber = i; 							/* suppose first number is the smallest */
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[smallestNumber]) { 		/* check if further elements of array are smaller than current element */
					smallestNumber = j;							
				}
			}

			int temp = input[smallestNumber]; 				/* Exchange current number with smallest number */
			input[smallestNumber] = input[i];
			input[i] = temp;
			System.out.print(input[i]+ " ");
		}
	}

}
