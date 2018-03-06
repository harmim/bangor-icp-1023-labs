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
	 * @param max the number of possible max random value
	 * @return an array filled with length numbers between 0 and n - 1
	 */
	public static int[] randomIntArray(int length, int max)
	{
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = generator.nextInt(max);
		}

		return array;
	}


	/**
	 * Creates an array filled wit random strings.
	 *
	 * @param length the length of the array
	 * @param chars the number of characters in each string
	 * @return an array filled with length lowercase strings of chars length
	 */
	public static String[] randomStringArray(int length, int chars)
	{
		String[] array = new String[length];
		for (int i = 0; i < length; i++) {
			array[i] = "";
			for (int j = 0; j < chars; j++) {
				array[i] += (char) (generator.nextInt(26) + 97);
			}
		}

		return array;
	}
}
