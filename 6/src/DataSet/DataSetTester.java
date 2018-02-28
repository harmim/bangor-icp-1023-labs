package DataSet;


/**
 * DataSet tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class DataSetTester
{
	public static void main(String[] args)
	{
		System.out.println("New DataSet\n");
		DataSet dataSet1 = new DataSet();
		for (double value : new double[] {500.0, 5000.0, 100.0, 10000.0, 2000.0}) {
			BankAccount bankAccount = new BankAccount(value);
			System.out.println("Adding: " + bankAccount);
			dataSet1.add(bankAccount);
		}
		System.out.println("\nMaximum = " + dataSet1.getMaximum());
		System.out.println("Minimum = " + dataSet1.getMinimum());
		System.out.println("Average = " + dataSet1.getAverage());

		System.out.println("\n\nNew DataSet\n");
		DataSet dataSet2 = new DataSet();
		for (int i = 0; i < 5; i++) {
			Die die = new Die(6);
			System.out.println("Adding: " + die);
			dataSet2.add(die);
		}
		System.out.println("\nMaximum = " + dataSet2.getMaximum());
		System.out.println("Minimum = " + dataSet2.getMinimum());
		System.out.println("Average = " + dataSet2.getAverage());
	}
}
