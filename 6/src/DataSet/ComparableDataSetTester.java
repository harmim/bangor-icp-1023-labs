package DataSet;


/**
 * ComparableDataSet tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class ComparableDataSetTester
{
	public static void main(String[] args)
	{
		System.out.println("New ComparableDataSet");
		ComparableDataSet comparableDataSet1 = new ComparableDataSet();
		comparableDataSet1.add("Alan");
		comparableDataSet1.add("Adam");
		comparableDataSet1.add("Betty");
		comparableDataSet1.add("Carol");
		System.out.println("Maximum = " + comparableDataSet1.getMaximum());
		System.out.println("Minimum = " + comparableDataSet1.getMinimum());
	}
}
