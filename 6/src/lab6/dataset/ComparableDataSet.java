package lab6.dataset;


/**
 * DataSet for comparable classes.
 * Purpose of this class is to provide methods to:
 * - Find maximum value from a set of measurable inputs.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class ComparableDataSet
{
	private Comparable max;
	private Comparable min;


	/**
	 * Initialises instance variables.
	 */
	public ComparableDataSet()
	{
		max = min = null;
	}


	/**
	 * Adds a data value to the set.
	 * Updates maximum and minimum if necessary.
	 *
	 * @param value value to be added to set
	 */
	public void add(Comparable value)
	{
		if (max == null && min == null) {
			min = max = value;
		}

		if (value.compareTo(max) > 0) {
			max = value;
		} else if (value.compareTo(min) < 0) {
			min = value;
		}
	}


	/**
	 * Returns maximum of ComparableDataSet.
	 *
	 * @return maximum of ComparableDataSet
	 */
	public Object getMaximum()
	{
		return max;
	}


	/**
	 * Returns minimum of ComparableDataSet.
	 *
	 * @return minimum of ComparableDataSet
	 */
	public Object getMinimum()
	{
		return min;
	}
}
