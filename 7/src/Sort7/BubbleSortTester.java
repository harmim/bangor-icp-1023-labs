package Sort7;


import Array7.ArrayUtil;
import java.util.Arrays;


/**
 * Bubble sort testing.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class BubbleSortTester
{
	public static void main(String[] args)
	{
		System.out.println("Bubble sort.");

		System.out.println("\nSort empty array.");
		int[] array1 = {};
		System.out.println("Array: " + Arrays.toString(array1));
		BubbleSorter.sort(array1);
		System.out.println("Sorted: " + Arrays.toString(array1));

		System.out.println("\nSort array with one element.");
		int[] array2 = {0};
		System.out.println("Array: " + Arrays.toString(array2));
		BubbleSorter.sort(array2);
		System.out.println("Sorted: " + Arrays.toString(array2));

		System.out.println("\nSort already sorted array.");
		int[] array3 = {1, 2, 3, 4, 5};
		System.out.println("Array: " + Arrays.toString(array3));
		BubbleSorter.sort(array3);
		System.out.println("Sorted: " + Arrays.toString(array3));

		System.out.println("\nSort reverse sorted array.");
		int[] array4 = {5, 4, 3, 2, 1};
		System.out.println("Array: " + Arrays.toString(array4));
		BubbleSorter.sort(array4);
		System.out.println("Sorted: " + Arrays.toString(array4));

		System.out.println("\nSort random array.");
		int[] array5 = ArrayUtil.randomIntArray(20, 10);
		System.out.println("Array: " + Arrays.toString(array5));
		BubbleSorter.sort(array5);
		System.out.println("Sorted: " + Arrays.toString(array5));

		System.out.println("\nSort another random array.");
		int[] array6 = ArrayUtil.randomIntArray(10, 100);
		System.out.println("Array: " + Arrays.toString(array6));
		BubbleSorter.sort(array6);
		System.out.println("Sorted: " + Arrays.toString(array6));
	}
}
