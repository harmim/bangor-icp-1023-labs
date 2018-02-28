package DataSet;


/**
 * MeasurableDataSet tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class MeasurableDataSetTester
{
	public static void main(String[] args)
	{
		System.out.println("New MeasurableDataSet\n");
		MeasurableDataSet measurableDataSet1 = new MeasurableDataSet();
		for (double value : new double[] {500.0, 5000.0, 100.0, 10000.0, 2000.0}) {
			BankAccount bankAccount = new BankAccount(value);
			System.out.println("Adding: " + bankAccount);
			measurableDataSet1.add(bankAccount);
		}
		System.out.println("\nMaximum = " + measurableDataSet1.getMaximum());
		System.out.println("Minimum = " + measurableDataSet1.getMinimum());
		System.out.println("Average = " + measurableDataSet1.getAverage());

		System.out.println("\n\nNew MeasurableDataSet\n");
		MeasurableDataSet measurableDataSet2 = new MeasurableDataSet();
		for (int i = 0; i < 5; i++) {
			Die die = new Die(6);
			System.out.println("Adding: " + die);
			measurableDataSet2.add(die);
		}
		System.out.println("\nMaximum = " + measurableDataSet2.getMaximum());
		System.out.println("Minimum = " + measurableDataSet2.getMinimum());
		System.out.println("Average = " + measurableDataSet2.getAverage());
	}
}
