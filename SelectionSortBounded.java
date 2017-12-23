/**
 * @author Nisarg Patel
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortBounded {

	public static void main(String[] args) {
		int input[] = { 25, 15, 5, 10, 0, 100, 30 };
		System.out.println("Input Array : "+Arrays.toString(input));
		

		System.out.println("Enter K (Number of elements you want to sort)");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		in.close();

		System.out.print("Sorted Array of "+k+" elements : [");
		selectionSort(input,k); // sorting array using selection sort
		System.out.print("] \n");

	}

	public static void selectionSort(int[] input,int k) {
		for (int i = 0; i < k; i++) {						/* sort only until k elements **/
			int smallestNumber = i; 					/* suppose current number is the smallest **/
			
			for (int j = i + 1; j < input.length; j++) {			/* check if further elements of array are smaller than current element **/
				if (input[j] < input[smallestNumber]) { 
					smallestNumber = j;
				}
				
			}

			int temp = input[smallestNumber]; 				/* Exchange current number with smallest number **/
			input[smallestNumber] = input[i];
			input[i] = temp;
			System.out.print(input[i]+ " ");
		}
	}

}
