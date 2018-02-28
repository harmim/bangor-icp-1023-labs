package DataSet;


/**
 * DataSet for measurable classes.
 * Purpose of this class is to provide methods to:
 * - Find maximum value from a set of measurable inputs.
 * - Compute the arithmetic mean of that set.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DataSet
{
	private int count;
	private double sum;
	private Measurable max;
	private Measurable min;


	/**
	 * Initialises instance variables.
	 */
	public DataSet()
	{
		count = 0;
		sum = 0;
		max = min = null;
	}


	/**
	 * Adds a data value to the set.
	 * Updates sum and count for average.
	 * Updates maximum and minimum if necessary.
	 *
	 * @param value value to be added to set
	 */
	public void add(Measurable value)
	{
		if (count == 0) {
			max = min = value;
		} else if (value.getMeasure() > max.getMeasure()) {
			max = value;
		} else if (value.getMeasure() < min.getMeasure()) {
			min = value;
		}

		sum += value.getMeasure();
		count++;
	}


	/**
	 * Returns maximum of DataSet.
	 *
	 * @return maximum of DataSet
	 */
	public Measurable getMaximum()
	{
		return max;
	}


	/**
	 * Returns minimum of DataSet.
	 *
	 * @return minimum of DataSet
	 */
	public Measurable getMinimum()
	{
		return min;
	}


	/**
	 * Returns average of DataSet.
	 *
	 * @return average of DataSet
	 */
	public double getAverage()
	{
		return count == 0 ? 0 : sum / count;
	}
}
