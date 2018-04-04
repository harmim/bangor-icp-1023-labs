package lab6.dataset;


/**
 * DataSet for measurable classes.
 * Purpose of this class is to provide methods to:
 * - Find maximum value from a set of measurable inputs.
 * - Compute the arithmetic mean of that set.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class MeasurableDataSet
{
	private int count;
	private double sum;
	private Measurable max;
	private Measurable min;


	/**
	 * Initialises instance variables.
	 */
	public MeasurableDataSet()
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
	 * Returns maximum of MeasurableDataSet.
	 *
	 * @return maximum of MeasurableDataSet
	 */
	public Measurable getMaximum()
	{
		return max;
	}


	/**
	 * Returns minimum of MeasurableDataSet.
	 *
	 * @return minimum of MeasurableDataSet
	 */
	public Measurable getMinimum()
	{
		return min;
	}


	/**
	 * Returns average of MeasurableDataSet.
	 *
	 * @return average of MeasurableDataSet
	 */
	public double getAverage()
	{
		return count == 0 ? 0 : sum / count;
	}
}
