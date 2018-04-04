package lab7.search;


import java.util.Arrays;
import java.util.List;


/**
 * Linear search testing.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class LinearSearcherTester
{
	public static void main(String[] args)
	{
		System.out.println("All occurrences searching.");
		List<Integer> occurrences;

		System.out.println("\nSearch element in empty array.");
		int[] array1 = {};
		System.out.println("Array: " + Arrays.toString(array1));
		occurrences = LinearSearcher.searchforAll(array1, 0);
		System.out.println("Search for 0: " + occurrences);

		System.out.println("\nSearch element in array with no occurrence.");
		int[] array2 = {1, 2, 3, 4, 5};
		System.out.println("Array: " + Arrays.toString(array2));
		occurrences = LinearSearcher.searchforAll(array2, 10);
		System.out.println("Search for 10: " + occurrences);

		System.out.println("\nSearch element in array with single occurrence.");
		System.out.println("Array: " + Arrays.toString(array2));
		occurrences = LinearSearcher.searchforAll(array2, 3);
		System.out.println("Search for 3: " + occurrences);

		System.out.println("\nSearch element in array with multiple occurrence.");
		int[] array3 = {3, 1, 2, 3, 3, 4, 5, 3};
		System.out.println("Array: " + Arrays.toString(array3));
		occurrences = LinearSearcher.searchforAll(array3, 3);
		System.out.println("Search for 3: " + occurrences);


		System.out.println("\n\nRecursive searching.");

		System.out.println("\nSearch element in empty array.");
		System.out.println("Array: " + Arrays.toString(array1));
		System.out.println("Search for 0: " + LinearSearcher.recursiveSearch(array1, 0, 0));

		System.out.println("\nSearch element in array with no occurrence.");
		System.out.println("Array: " + Arrays.toString(array2));
		System.out.println("Search for 10: " + LinearSearcher.recursiveSearch(array2, 10, 0));

		System.out.println("\nSearch element in array with single occurrence.");
		System.out.println("Array: " + Arrays.toString(array2));
		System.out.println("Search for 3: " + LinearSearcher.recursiveSearch(array2, 3, 0));

		System.out.println("\nSearch element in array with multiple occurrence.");
		System.out.println("Array: " + Arrays.toString(array3));
		System.out.println("Search for 3: " + LinearSearcher.recursiveSearch(array3, 3, 0));
	}
}
