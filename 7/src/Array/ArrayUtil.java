package Array;


import java.util.Random;


/**
 * The class ArrayUtil contains utility methods for array manipulation.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class ArrayUtil
{
	/**
	 * Random generator static instance.
	 */
	private static Random generator = new Random();


	/**
	 * Creates an array filled with random values.
	 *
	 * @param length the length of the array
	 * @param n the number of possible random values
	 * @return an array filled with length numbers between 0 and n - 1
	 */
	public static int[] randomIntArray(int length, int n)
	{
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(n);
		}

		return a;
	}
}
