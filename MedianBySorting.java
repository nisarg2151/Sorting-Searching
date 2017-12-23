/**
 * @author Nisarg Patel
 *
 */
import java.util.Arrays;

public class MedianBySorting {

	public static void main(String[] args) {
		int input[] = { 25, 15, 5, 10, 0, 100, 30 };
		float median = 0;
		System.out.println("Input Array : " + Arrays.toString(input));
		median = (input.length) / 2;
		System.out.print("Sorted Array till median : ");

		if (input.length % 2 == 0) {
			selectionSort(input, (int) median + 1);                       			  /*call selection sort to sort elements until median*/
			System.out.println("\n \nMedian is --> "
			+ (((float) (input[(int) (median - 1)])) + ((float) (input[(int) median]))) / 2); /* if array is of even length -- Median is average of middle elements */
		} else {
			selectionSort(input, (int) median);	               				  /*call selection sort to sort elements until median*/
			System.out.println("\n \nMedian is --> " + input[(int) (median - 1)]);
		}
	}

	public static void selectionSort(int[] input, int k) {
		for (int i = 0; i < k; i++) {							/* sort only until k elements **/
			int smallestNumber = i;							/* suppose first number is the smallest **/
			for (int j = i + 1; j < input.length; j++) {				/* check if further elements of array are smaller than current element **/
				if (input[j] < input[smallestNumber]) {
					smallestNumber = j;
				}
			}
			int temp = input[smallestNumber];					/* Exchange current number with smallest number **/
			input[smallestNumber] = input[i];
			input[i] = temp;
			System.out.print(input[i] + " ");
		}
	}

}
