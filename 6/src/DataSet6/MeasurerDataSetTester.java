package DataSet6;


import java.awt.Rectangle;


/**
 * MeasurerDataSet tester class.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class MeasurerDataSetTester
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(0, 0, 10, 10);
		Rectangle rectangle2 = new Rectangle(0, 0, 10, 20);
		Rectangle rectangle3 = new Rectangle(0, 0, 100, 50);
		System.out.println("Rectangles:\n" + rectangle1 + "\n" + rectangle2 + "\n" + rectangle3);

		System.out.println("\nNew MeasurerDataSet with RectangleAreaMeasurer");
		MeasurerDataSet measurerDataSet1 = new MeasurerDataSet(new RectangleAreaMeasurer());
		measurerDataSet1.add(rectangle1);
		measurerDataSet1.add(rectangle2);
		measurerDataSet1.add(rectangle3);
		System.out.println("Maximum = " + measurerDataSet1.getMaximum());
		System.out.println("Minimum = " + measurerDataSet1.getMinimum());
		System.out.println("Average = " + measurerDataSet1.getAverage());

		System.out.println("\nNew MeasurerDataSet with RectanglePerimeterMeasurer");
		MeasurerDataSet measurerDataSet2 = new MeasurerDataSet(new RectanglePerimeterMeasurer());
		measurerDataSet2.add(rectangle1);
		measurerDataSet2.add(rectangle2);
		measurerDataSet2.add(rectangle3);
		System.out.println("Maximum = " + measurerDataSet2.getMaximum());
		System.out.println("Minimum = " + measurerDataSet2.getMinimum());
		System.out.println("Average = " + measurerDataSet2.getAverage());


		System.out.println("\nNew MeasurerDataSet with BankAccountMeasurer and BankAccountFilter");
		MeasurerDataSet measurerDataSet3 = new MeasurerDataSet(new BankAccountMeasurer(), new BankAccountFilter());
		for (double value : new double[] {500.0, 5000.0, 100.0, 10000.0, 2000.0}) {
			BankAccount bankAccount = new BankAccount(value);
			System.out.println("Adding: " + bankAccount);
			measurerDataSet3.add(bankAccount);
		}
		System.out.println("Maximum = " + measurerDataSet3.getMaximum());
		System.out.println("Minimum = " + measurerDataSet3.getMinimum());
		System.out.println("Average = " + measurerDataSet3.getAverage());
	}
}
