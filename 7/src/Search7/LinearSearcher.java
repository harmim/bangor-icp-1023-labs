package Search7;


import java.util.ArrayList;
import java.util.List;


/**
 * Linear searching.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class LinearSearcher
{
	/**
	 * Search for all int elements in array.
	 *
	 * @param haystack array with elements for searching
	 * @param needle value to be searched
	 * @return list of all occurrences of searched value or empty list in case of no occurrences
	 */
	public static List<Integer> searchforAll(int[] haystack, int needle)
	{
		List<Integer> occurrences = new ArrayList<>();
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				occurrences.add(i);
			}
		}

		return occurrences;
	}


	/**
	 * Recursively search for element in array.
	 *
	 * @param haystack array with elements for searching
	 * @param needle value to be searched
	 * @param index index for start searching, should be 0 for outer invoking
	 * @return index of first found element or -1 in case of no occurrences
	 */
	public static int recursiveSearch(int[] haystack, int needle, int index)
	{
		if (index >= haystack.length) {
			return -1;
		}

		if (haystack[index] == needle) {
			return index;
		}

		return recursiveSearch(haystack, needle, index + 1);
	}
}
