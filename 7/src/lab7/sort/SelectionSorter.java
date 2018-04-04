package lab7.sort;


/**
 * Selection sort algorithm.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class SelectionSorter
{
	/**
	 * Sorts the array of String elements in descending order.
	 *
	 * @param array the array of Strings to be sorted
	 */
	public static void sort(String[] array)
	{
		for (int i = 0; i < array.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[max]) > 0) {
					max = j;
				}
			}

			String tmp = array[i];
			array[i] = array[max];
			array[max] = tmp;
		}
	}
}
