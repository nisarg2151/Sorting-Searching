import java.util.Arrays;

public class IndexSearch {

	public static void main(String[] args) {
		int[] array = { -21, 0, 2, 4, 5, 20, 66 };				//Given array which is sorted and have distinct elements
		System.out.println("Input Array " + Arrays.toString(array));
		int index = searchMatchIndex(array, 0, array.length - 1);		
		if (index == -1)
			System.out.println("No Matching Index found");
		else
			System.out.println("Index Match Found at i = " + index);
	}

	public static int searchMatchIndex(int[] arr, int a, int z) {
		int j = 0;
		if (a < z) {								 //proceed only if starting index is smaller that last index
			int i = ((a + z) / 2);						 //get index of mid element for given array
			if (i == arr[i])						 //if mid element is equal to its index , return it
				j = i;
			if (i > arr[i])
				j = searchMatchIndex(arr, i + 1, z);	 //if mid element is greater than its index , then just search on right side of mid element
			if (i < arr[i])
				j = searchMatchIndex(arr, a, i);	 //if mid element is less than its index , then just search on left side of mid element
		}else
			return -1;					 //return -1 if no such index is found and a < z

		return j;
	}

}
