package Search;


import java.util.Arrays;


/**
 * Binary search testing.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BinarySearcherTester
{
	public static void main(String[] args)
	{
		System.out.println("Binary String searching.");

		System.out.println("\nSearch String in empty array.");
		String[] array1 = {};
		System.out.println("Array: " + Arrays.toString(array1));
		System.out.println("Search for 'A foo' (should be -1): " + BinarySearcher.search(array1, "A foo"));

		System.out.println("\nSearch String in array with no occurrence.");
		String[] array2 = {"A foo", "B foo", "C foo", "D foo", "E foo"};
		System.out.println("Array: " + Arrays.toString(array2));
		System.out.println("Search for 'A bar' (should return -1): " + BinarySearcher.search(array2, "A bar"));

		System.out.println("\nSearch String in array with no occurrence.");
		System.out.println("Array: " + Arrays.toString(array2));
		System.out.println("Search for 'C bar' (should return -2): " + BinarySearcher.search(array2, "C bar"));

		System.out.println("\nSearch String in array with no occurrence.");
		System.out.println("Array: " + Arrays.toString(array2));
		System.out.println("Search for 'X bar' (should return -6): " + BinarySearcher.search(array2, "X bar"));

		System.out.println("\nSearch element in array with single occurrence.");
		System.out.println("Array: " + Arrays.toString(array2));
		System.out.println("Search for 'C foo': " + BinarySearcher.search(array2, "C foo"));

		System.out.println("\nSearch element in array with multiple occurrence.");
		String[] array3 = {"A foo", "B foo", "C foo", "C foo", "D foo", "E foo"};
		System.out.println("Array: " + Arrays.toString(array3));
		System.out.println("Search for 'C foo': " + BinarySearcher.search(array3, "C foo"));
	}
}
