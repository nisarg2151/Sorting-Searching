
/**
 * @author Nisarg Patel
 *
 */
import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int[] a = { 62, 83, 18, 53, 07, 17, 95, 86, 47, 69, 25, 28 };
		System.out.println("Input Array --> " + Arrays.toString(a) + "\n");
		System.out.println("Final Sorted Array --> " + Arrays.toString(coolSort(a)));

	}

	public static int[] coolSort(int[] array) {
		int len = array.length;
		int gap = 5;

		while (gap >= 1) {

			for (int i = 0; i <= gap; i++) {

				int temp = array[i];
				int j = i;

				while (j + gap < len) {
					if (array[j + gap] < temp) {			/* check for smallest element between [current] and [current+gap] elements till end */
						array[j] = array[j + gap];								
						array[j + gap] = temp;			/*  swap them if they are not sorted already */
					}
					
					while (j - gap >= 0 && array[j - gap] > array[j]) { /* Check for smallest element between [current] & [current-gap] elements till start */
						int temp2 = array[j];
						array[j] = array[j - gap];		    /* swap them if they are not sorted already */
						array[j - gap] = temp2;
					}
					
					j = j + gap;
					temp = array[j];
				}
			}	

			System.out.println("GAP " + gap + " --> " + Arrays.toString(array) + "\n");

			gap = gap - 2; 			/** For H =[5,3,1] **/
			//gap = gap/2; 			/**For H =[5,2,1] We can generate any such H ending in 1 by using different calculations here **/
		}

		return array;
	}

}
