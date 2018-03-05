package DataSet;


/**
 * DataSet with measurer.
 * Purpose of this class is to provide methods to:
 * - Find maximum value from a set of measurable inputs.
 * - Compute the arithmetic mean of that set.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class MeasurerDataSet
{
	private int count;
	private double sum;
	private Object max;
	private Object min;
	private Measurer measurer;
	private Filter filter;


	/**
	 * Initialises instance variables.
	 */
	public MeasurerDataSet(Measurer measurer)
	{
		count = 0;
		sum = 0;
		max = min = null;
		this.measurer = measurer;
		this.filter = null;
	}


	/**
	 * Initialises instance variables with filter.
	 */
	public MeasurerDataSet(Measurer measurer, Filter filter)
	{
		count = 0;
		sum = 0;
		max = min = null;
		this.measurer = measurer;
		this.filter = filter;
	}


	/**
	 * Adds a data value to the set.
	 * Updates sum and count for average.
	 * Updates maximum and minimum if necessary.
	 *
	 * @param value value to be added to set
	 */
	public void add(Object value)
	{
		if (filter != null && !filter.accept(value)) {
			return;
		}

		if (count == 0) {
			max = min = value;
		} else if (measurer.measure(value) > measurer.measure(max)) {
			max = value;
		} else if (measurer.measure(value) < measurer.measure(min)) {
			min = value;
		}

		sum += measurer.measure(value);
		count++;
	}


	/**
	 * Returns maximum of MeasurerDataSet.
	 *
	 * @return maximum of MeasurerDataSet
	 */
	public Object getMaximum()
	{
		return max;
	}


	/**
	 * Returns minimum of MeasurerDataSet.
	 *
	 * @return minimum of MeasurerDataSet
	 */
	public Object getMinimum()
	{
		return min;
	}


	/**
	 * Returns average of MeasurerDataSet.
	 *
	 * @return average of MeasurerDataSet
	 */
	public double getAverage()
	{
		return count == 0 ? 0 : sum / count;
	}
}
