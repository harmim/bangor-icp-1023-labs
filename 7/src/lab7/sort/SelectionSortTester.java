package lab7.sort;


import lab7.array.ArrayUtil;
import java.util.Arrays;


/**
 * Selection sort testing.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class SelectionSortTester
{
	public static void main(String[] args)
	{
		System.out.println("Selection sort.");

		System.out.println("\nSort empty array.");
		String[] array1 = {};
		System.out.println("Array: " + Arrays.toString(array1));
		SelectionSorter.sort(array1);
		System.out.println("Sorted: " + Arrays.toString(array1));

		System.out.println("\nSort array with one element.");
		String[] array2 = {"Bar"};
		System.out.println("Array: " + Arrays.toString(array2));
		SelectionSorter.sort(array2);
		System.out.println("Sorted: " + Arrays.toString(array2));

		System.out.println("\nSort already sorted array.");
		String[] array3 = {"Xac", "Xab", "Bx", "Ba", "B", "A"};
		System.out.println("Array: " + Arrays.toString(array3));
		SelectionSorter.sort(array3);
		System.out.println("Sorted: " + Arrays.toString(array3));

		System.out.println("\nSort reverse sorted array.");
		String[] array4 = {"A", "B", "Ba", "Bx", "Xab", "Xac"};
		System.out.println("Array: " + Arrays.toString(array4));
		SelectionSorter.sort(array4);
		System.out.println("Sorted: " + Arrays.toString(array4));

		System.out.println("\nSort random array.");
		String[] array5 = ArrayUtil.randomStringArray(20, 3);
		System.out.println("Array: " + Arrays.toString(array5));
		SelectionSorter.sort(array5);
		System.out.println("Sorted: " + Arrays.toString(array5));

		System.out.println("\nSort another random array.");
		String[] array6 = ArrayUtil.randomStringArray(10, 5);
		System.out.println("Array: " + Arrays.toString(array6));
		SelectionSorter.sort(array6);
		System.out.println("Sorted: " + Arrays.toString(array6));
	}
}
