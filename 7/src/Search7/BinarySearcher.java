package Search7;


/**
 * Binary searching.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BinarySearcher
{
	/**
	 * Search for string in array.
	 *
	 * @param haystack array with string elements for searching
	 * @param needle string value to be searched
	 * @return index of some found string or -insert position - 1 in case of no occurrences
	 */
	public static int search(String[] haystack, String needle)
	{
		int low = 0, high = haystack.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2, compare = needle.compareTo(haystack[mid]);

			if (compare == 0) {
				return mid;
			}

			if (compare > 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -low - 1;
	}
}
