package lab6.dataset;


/**
 * DataSet for Double Values.
 * Purpose of this class is to provide methods to:
 * - Find maximum value from a set of numeric inputs.
 * - Compute the arithmetic mean of that set.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DoubleDataSet
{
	private int count;
	private double sum;
	private double max;
	private double min;


	/**
	 * Initialises instance variables.
	 */
	public DoubleDataSet()
	{
		count = 0;
		sum = max = min = 0;
	}


	/**
	 * Adds a data value to the set.
	 * Updates sum and count for average.
	 * Updates maximum and minimum if necessary.
	 *
	 * @param value value to be added to set
	 */
	public void add(double value)
	{
		if (count == 0) {
			max = min = value;
		} else if (value > max) {
			max = value;
		} else if (value < min) {
			min = value;
		}

		sum += value;
		count++;
	}


	/**
	 * Returns maximum of DoubleDataSet.
	 *
	 * @return maximum of DoubleDataSet
	 */
	public double getMaximum()
	{
		return max;
	}


	/**
	 * Returns minimum of DoubleDataSet.
	 *
	 * @return minimum of DoubleDataSet
	 */
	public double getMinimum()
	{
		return min;
	}


	/**
	 * Returns average of DoubleDataSet.
	 *
	 * @return average of DoubleDataSet
	 */
	public double getAverage()
	{
		return count == 0 ? 0 : sum / count;
	}
}
