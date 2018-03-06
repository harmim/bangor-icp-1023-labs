package Sort;


/**
 * Bubble sort algorithm.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BubbleSorter
{
	/**
	 * Sorts the array of integer elements in ascending order.
	 *
	 * @param array the array of integers to be sorted
	 */
	public static void sort(int[] array)
	{
		boolean swapped = true;
		for (int j = 0; swapped; j++) {
			swapped = false;
			for (int i = 1; i < array.length - j; i++) {
				if (array[i] < array[i - 1]) {
					swapped = true;
					int tmp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = tmp;
				}
			}
		}
	}
}
